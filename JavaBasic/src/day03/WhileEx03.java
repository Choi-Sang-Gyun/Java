package day03;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//while 조건은 다양한 형식으로 만들어질 수도 있음.
		//어떤 수를 입력받아서, 이 수가 소수(약수가 1과 자기자신인 수)인지 확인.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력> ");
		int num = scan.nextInt();
		int a = 2;
		
		while (num % a != 0 ) { // 1바퀴만 해석해서 돌려보자 (이해할 때 편하다)
			a++;
		}
		
		if (num == a) {
			System.out.println("이 수는 소수입니다.");
		} else {
			System.out.println("이 수는 소수가 아닙니다.");
		}
		
		scan.close();
		}
}
