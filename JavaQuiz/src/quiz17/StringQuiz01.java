package quiz17;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * id문자열을 입력받습니다
		 * 아이디는 공백을 포함해서 받을 수 있습니다
		 * 공백을 제외하고, 5글자 미만이면, 다시 입력 받습니다
		 * 5글자 이상이라면 "id 등록"을 출력하고 종료
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		String id = scan.nextLine();
		String id2 = id.replace(" ", "");
		
		if(id2.length() >= 5) {
			System.out.println(id2 + " 등록");
			break;
		} else {
			System.out.println("5자 이상으로 다시 입력해주세요");
		}
		
		}
	}
	
	
}
