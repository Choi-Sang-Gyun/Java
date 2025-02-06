package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//백준 2차원 배열 - 2566번
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < arr.length; i++ ) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = scan.nextInt();
			
				if (arr[i][j] >= a) {
					a = arr[i][j];
					b = i+1;
					c = j+1;
				}
			}
		}
		
		System.out.println(a);
		System.out.print(b + " " + c);
		
		
		
		scan.close();
	}
}
