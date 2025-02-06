package quiz01;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		/*
		 * 어떤 수 1개를 입력받습니다.
		 * 이 숫자가 홀수, 짝수, 0, 음수 인지를 구분해서 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("어떤 수>");
		int a = scan.nextInt();
		
		if (a < 0) {
			System.out.println("음수입니다.");
		} else if ( a == 0) {
			System.out.println("0입니다.");
		} else if ( a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		scan.close();
	}
}
