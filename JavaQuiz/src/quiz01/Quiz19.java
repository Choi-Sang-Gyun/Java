package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] arr = new int[a];
		
		
		for(int i = 0; i < arr.length; i++) {
			int c = scan.nextInt();
			arr[i] = c;
			
			if (b > arr[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		
	}
}
