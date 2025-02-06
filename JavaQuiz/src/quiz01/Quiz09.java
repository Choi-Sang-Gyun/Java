package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 1;
		
		while (b < 10) {
			System.out.println(a + " * " + b + " = " + (a*b));
			b++;
		}
		System.out.println("반복문 종료");
		
		scan.close();
		
	}
}
