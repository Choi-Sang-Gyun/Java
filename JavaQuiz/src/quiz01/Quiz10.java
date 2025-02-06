package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1. 1~입력 받은 수 까지의 6의 배수의 합
		//제어변수 -> 조건 -> 제어변수
		
		System.out.print("정수 입력>");
		int a = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= a) {
			if(i % 6 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("6의 배수의 합:" + sum);
			
		//2. 1~100까지 정수 중에서 4의 배수 이면서, 8의 배수가 아닌 수의 개수
		
		int b = 1;
		int c = 0;
		
		while ( b <= 100) {
			if (b % 4 == 0 && b % 8 != 0) {
				c++;
			}
			b++;
		}
		
		System.out.println("1~100 까지의 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 개수:" + c);

		//3. 50~100까지 정수들의 합
		
		int d = 50;
		int e = 0;
		
		while (d <= 100) {
			e = e+d;
			d++;
		}
		
		System.out.println("50~100까지의 정수들의 합:" + e);
		
		//4. 1000의 약수들의 개수
		
		int f = 1;
		int g = 0;
		
		while (f <= 1000) {
			if (1000 % f == 0) {
				g++;
			}
			f++;
		}
		
		System.out.println("1000의 약수들의 개수:" + g);
		
		scan.close();
	}
}
