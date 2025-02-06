package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		/*
		 * 두 정수 A B를 한 번에 입력받은 다음에 A + B의 결과를 출력하는 프로그램 코드를 만들어라
		 * 
		 * 입력
		 * 1 2
		 * 출력
		 * 3
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();	
		int number2 = scan.nextInt();
		
		System.out.println(number + number2);
		
		scan.close();
		
	}
}
