package day03;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		
		//1~10까지 합 for
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
	
		System.out.println("1~10까지의 합:" + sum);
		System.out.println("------------------------------------------");
		
		//반대로 돌아가는 for문
		
		for(int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
		
		System.out.println("------------------------------------------");
		
		//for문으로 입력받은 구구단을 출력.
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for (int b = 1; b <= 9; b++ ) {
			System.out.println(a + " * " + b + " = " + a*b);
		}
		
		scan.close();
		
		
		
		
	}
}
