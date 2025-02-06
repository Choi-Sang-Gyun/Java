package quiz20;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapQuiz02 {

	public static void main(String[] args) {
		
	
	/*
	메뉴관리 시뮬레이터
	
	무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
	
	* 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
	음식 메뉴 정보
	1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료
	
	1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
	2. 메뉴와 가격을 전부 출력
	3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
	4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
	5. 프로그램 종료
	*/
		
	Scanner scan = new Scanner(System.in);
	Map<String, Integer> map = new TreeMap<>();
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	
	
	x:while(true) {
		
		System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
		System.out.print(">");
		
		int menuNum = 0;
		boolean check = true;
		
		while(check) {
			try {
				menuNum = scan.nextInt();
				check = !check;
			} catch (Exception e) {
				System.out.println("잘못 입력 하셨습니다. 숫자를 입력해주세요");
				scan.nextLine();
				System.out.print(">");
			}
		}
		
		switch (menuNum) {
		case 1:
			System.out.println("========신규 메뉴 등록=========");
			System.out.print("메뉴명>");
			String newMenu = scan.next();
			
			if(map.containsKey(newMenu)) {
				System.out.println(newMenu + "는 이미 등록된 메뉴입니다");
			} else {
			
				System.out.print("가격>");
				int newValue = scan.nextInt();
				
				map.put(newMenu, newValue);
				
				System.out.println("등록되었습니다");
			}
			break;
		case 2:
			System.out.println("=========메뉴판 전체 보기=========");
			
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
			}
			
			
			break;
		case 3:
			System.out.println("=============메뉴판 수정============");
			
			System.out.println("수정할 메뉴의 이름을 적어주세요");
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
			}
			
			System.out.print("메뉴명>");
			String changeMenu = scan.next();
			System.out.print("수정 가격>");
			int changeValue = scan.nextInt();
			
			if(map.containsKey(changeMenu)) {
				map.put(changeMenu, changeValue);
				System.out.println("수정되었습니다.");
			} else {
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			}	
			
		break;
		case 4:
			System.out.println("=============메뉴판 삭제============");
			
			System.out.println("삭제할 메뉴의 이름을 적어주세요");
			for (Entry<String, Integer> entry : entrySet) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + "원");
			}
			System.out.print("메뉴명>");
			String delMenu = scan.next();
		
			if(map.containsKey(delMenu)) {
				map.remove(delMenu);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			}
			
		break;
		case 5:
			System.out.println("종료하시겠습니까?");
			System.out.println("1. 종료한다 2.종료하지 않는다");
			System.out.print(">");
			int end = scan.nextInt();
			
			if(end == 1) {
				System.out.println("프로그램 종료");
				break x ;
				
			} else if (end == 2) {
				
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		
		break;
	
		default:
			System.out.println("잘못 입력 하셨습니다");
			break;
		}
			
	}
		
		
	
	}
	
}
