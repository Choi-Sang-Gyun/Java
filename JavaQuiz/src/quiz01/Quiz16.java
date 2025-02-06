package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 수를 입력 받아서, 입력받은 수 까지의 모든 소수들의 합계를 구합니다
		 * 소수 - 약수가 1과 자기자신인 수 (약수의 개수가 2개)
		 * 
		 * 예를 들어 1 -> 소수x, 2 -> 소수o
		 * 3->소수
		 * 5->소수
		 * 7->소수
		 * 
		 * 입력   출력
		 * 10 -> 2 + 3 + 5 + 7 + = 17
		 * 13 -> 2 + 3 + 5 + 7 + 11 + 13 = 41
		 * 
		 * 정수입력>
		 * 1에서 (입력정수)까지 합:
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int a = scan.nextInt();
		int b = 0;
		
		
		for(int i = 2; i < a; i++) {
			// 0, 1 은 소수x
			int c = 0;
			
			for (int j = 1; j <= i; j++) {
				//약수의 개수를 구하기
				if (i % j == 0) {
					c++;
				}
			}
			
			if (c == 2) {
				//i는 소수라고 할 수 있다
				b += i;
			}		
		}
		System.out.println("1에서 " + a + "까지의 소수의 합:" + b);
	
		scan.close();
	}
}
