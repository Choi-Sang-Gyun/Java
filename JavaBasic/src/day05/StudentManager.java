package day05;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
	
				
		start:while(true) {
			
			System.out.println("[현재 고객수]:" + count + "\n[조회위치]:" + index);
			System.out.println("[메뉴] 1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.프로그램 종료");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch (menu) {
			case "추가":
			case "1":
				System.out.println("========회원 정보를 입력합니다=========");
				add();
				System.out.println("<회원정보 입력 성공!!>");
				break;
			case "이전정보":
			case "2":
				
				/*
				 * 이전 정보출력
				 * index위치를 -1 시키고 해당 위치정보를 출력
				 * 
				 * 이전정보가 존재하지 않는 조건
				 * index <=0
				 */
				
				System.out.println("========이전 회원 정보를 출력합니다========");
				
				if (index <= 0) {
					System.out.println("<이전 정보는 없습니다>");
				} else {
					index--;
					printInfo();
					System.out.println("====================================");
				}
				
				break;
			case "다음정보":
			case "3":
				System.out.println("========다음 회원 정보를 출력합니다========");
				
				if(index >= count-1) {
					System.out.println("<다음 정보는 없습니다>");
				} else {
					index++;
					printInfo();
					System.out.println("====================================");
				}
				
				break;
			case "현재정보":
			case "4":
				
				/*
				 * 현재 index가 가르키고 있는 위치의 정보를 출력해주면 됩니다.
				 * 
				 * 출력이 가능한 조건
				 * index >= 0, index <= count-1 일때 출력 가능
				 * 
				 */
				
				System.out.println("========현재 회원 정보를 출력합니다========");
				
				if(index >= 0 && index <= count-1) {
					printInfo();
					System.out.println("====================================");
				} else {
					System.out.println("<현재 정보는 없습니다>");
				}
				
				break;
			case "정보수정":
			case "5":
				
				/*
				 * 정보수정
				 * 새로운 이름, 나이를 입력받아서 현재 위치를 수정해주면 됩니다
				 * 
				 * 현재위치가 수정가능한 조건은 생각해보세요
				 */
				
				System.out.println("========현재 회원 정보를 수정합니다========");
				
				if(index >= 0 && index <= count-1) {
					reWrite();
					System.out.println("회원정보 수정 완료!!");
				} else {
					System.out.println("<현재 정보는 없습니다>");
				}
				
				break;
			case "정보삭제":
			case "6":
				
				/*
				 * 정보삭제
				 * 현재 삭제하려는 index 위치부터 ~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				 * count를 감소
				 * 
				 * 삭제 가능한 조건은 위와 동일함
				 *  
				 */
				
				System.out.println("========현재 회원 정보를 삭제합니다========");
				
				if(index >= 0 && index <= count-1) {
					delete();
					
				} else {
					System.out.println("<현재 정보는 없습니다>");
				}
				
				break;
			case "프로그램 종료":
			case "7":
				
				/*
				 * 반복문을 탈출하고 프로그램 종료
				 * 
				 */
								
				System.out.println("정말로 종료하시겠습니까?");
				System.out.print("1.예" + " " + "2.아니오" + "\n>");
				int a = scan.nextInt();
				
				if (a == 1) {
					break start;
				} else if(a == 2) {
					break;
				} else {
					System.out.println("<잘못 입력하셨습니다.>");
					break;
				}
					
			default:
				System.out.println("<잘못 입력하셨습니다.>");
				break;
			}
	
		}
		
	}
	
	static Scanner scan = new Scanner(System.in);
	
	static String[] nameList = new String[100]; // 배열을 늘리거나 줄이거나 x
	static int[] ageList = new int [100];
	static int count = 0; //사람 수(고객 수)
	static int index = -1; // 위에 있는 배열에 조회하는 위치(포인터)
	static int x = 1;
	//예를 들어서 index = 0이면, 배열의 0번째 위치를 조회하고 있음
	
	//1번
 	static void add() {
		
		//입력을 받고, 배열에 추가
		System.out.print("이름>");
		String name = scan.next();
		System.out.print("나이>");
		int age = scan.nextInt();
		
		nameList[count] = name;
		ageList[count] = age;
		count++; // 고객 수 증가
		
	}
	
	//2, 3, 4번
	static void printInfo() {
		System.out.println("이름:" + nameList[index]);
		System.out.println("나이:" + ageList[index]);
	}
	
	//5번
	static void reWrite() {
		System.out.print("수정할 이름>");
		String name = scan.next();
		System.out.print("수정할 나이>");
		int age = scan.nextInt();
		
		nameList[index] = name;
		ageList[index] = age;
	}
	
	//6번
	static void delete() {
		System.out.println("정말로 삭제하시겠습니까?");
		System.out.print("1.예" +" " + "2.아니오" + "\n>");
		int a = scan.nextInt();
		if (a == 1) {
//			String[] temp = new String[100];
//			int[] temp2 = new int[100];
//			
//			for (int i = 0; i < index; i++) {
//				temp[i] = nameList[i];
//				temp2[i] = ageList[i];
//				
//			}
//			
//			for (int i = index; i < temp.length-1; i++) {
//				temp[i] = nameList[i+1];
//				temp2[i] = ageList[i+1];
//			}
//			
//			nameList = temp;
//			ageList = temp2;
//			temp = null;
//			temp2 = null;
//			
//			System.out.println("<회원정보 삭제 완료!!>");
//			count--;
			
			for(int i = index; i< count-1; i++) {
				nameList[i] = nameList[i+1];
				ageList[i] = ageList[i+1];
				
				System.out.println("<회원정보 삭제 완료!!>");
				count--;
			}
			
		} else if(a == 2) {
			
		} else {
			System.out.println("<잘못 입력하셨습니다.>");
		}
	}
}
