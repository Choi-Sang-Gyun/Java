package quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	/*
	 * 회원정보 프로그램 시뮬레이터
	 * 
	 * 무한반복문 안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다
	 * 
	 * 메뉴 1.유저등록, 2전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료
	 * 
	 * 1.스캐너로 name, age 입력받아서 user 객체를 리스트에 추가
	 * 2. 모든 회원 정보를 출력하면 됩니다
	 * 3. 찾을 이름을 입력받아서, 이름이 있으면, 이름과 나이를 출력해줍니다
	 *    찾는 이름이 없으면 "~~님은 목록에 없습니다"를 출력합니다
	 * 4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 user를 삭제
	 * 5. 종료
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<User>();
		
		
		
		
		x:while(true) {
			System.out.println("메뉴\n1.유저등록, 2.전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료");
			System.out.print("메뉴 번호입력>");
			String menu = scan.nextLine();
			
			switch (menu) {
			
				case "유저등록":
				case "1":
					System.out.print("유저등록>");
					String name = scan.next();
					int age = scan.nextInt();
					
					list.add(new User(name, age));
					System.out.println(name + " 등록완료");
					break;
					
				case "전체회원정보출력":
				case "2":
					System.out.println("전체회원정보출력");
					
					for (User u : list) {
						System.out.println(u.getName() + " " + u.getAge());
					}
									
					break;
				
				case "회원정보검색":
				case "3":
					System.out.println("회원정보검색");
					System.out.print("이름>");
					String nameSeurch = scan.next();
					
					int i = 0;
					
					for(User u : list) {
						if(u.getName().equals(nameSeurch)) {
							System.out.println(u.getName() + " " + u.getAge());
						} else {
							i++;
						}
					}
					
					if(i == list.size()) {
						System.out.println(nameSeurch + "님은 목록에 없습니다.");
					}
					
					break;
				
				case "회원정보삭제":
				case "4":
					System.out.println("회원정보삭제");
					System.out.print("이름>");
					String nameSeurch2 = scan.next();
					int k = 0;
					
//					for(User u : list) {
//						if(u.getName().equals(nameSeurch2)) {
					
					for(int j = 0; j < list.size(); j++) {
						User u = list.get(j);
						String seurchName = u.getName();
						
						if(nameSeurch2.equals(seurchName)) {
							list.remove(u);
							
//							list.remove(n);
//							list.remove(u.getName());
//							list.remove(u.getAge());
							System.out.println(nameSeurch2 + "님이 삭제되었습니다");
						} else {
							k++;
						}
					}
					
					if(k == list.size()) {
						System.out.println(nameSeurch2 + "님은 목록에 없습니다.");
					}
						
					break;
				
				case "프로그램종료":
				case "5":
					System.out.println("프로그램종료");
					System.out.println("정말 종료하시겠습니까?\n1.종료한다. 2.종료하지 않는다.");
					int end = scan.nextInt();
					
					if(end == 1) {
						break x;
					} else {
						break;
					}
					
				default :
					System.out.println("잘못 입력하셨습니다.");
					String errorMemu = scan.nextLine();
					break;
				
				}
		}
		scan.close();
	}	
}