package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 랜덤한 1~100 사이의 수로 문제를 생성하고, 정답 맞추기 프로그램
		 * 
		 * 0을 입력하면 종료가 됩니다.
		 * 종료될때는 정답, 오답 개수를 출력해 주세요
		 * 두자리 수 2개 문제
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		int c = 0;
		int d = 0;
		
		
		while (true) {
			int a = (int)(Math.random()*99+1);
			int b = (int)(Math.random()*99+1);
			
			System.out.println("-----------------------");
			System.out.println(a + " + " + b + " = ?");
			System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if ( answer == 0 ) {
				break;
			} else if (answer == a+b) {
				c++;
				System.out.println("정답입니다");
			} else {
				d++;
				System.out.println("틀렸는데요?");
			}
		}
		System.out.println("프로그램 정상 종료");
		System.out.println("정답:" + c);
		System.out.println("오답:" + d);
		
		scan.close();	
		
	}
}
