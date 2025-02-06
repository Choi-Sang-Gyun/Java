package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//아스키 코드의 차
		
		int n = scan.nextInt();
		String a = scan.next();
		char[] arr = a.toCharArray();
		int b = 0; 
		
		for ( int i = 0; i < arr.length; i++) {
			b += arr[i];
		}
		
		System.out.println(b - (48*arr.length));
		
		scan.close();
	}
	
}
