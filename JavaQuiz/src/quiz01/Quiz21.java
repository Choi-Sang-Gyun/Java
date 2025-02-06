package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 1; i <= m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int temp = 0;
			
			temp = arr[(a-1)];
			arr[(a-1)] = arr[(b-1)];
			arr[(b-1)] = temp;
		}
		
		for (int i = 0; i < arr.length; i++ ) {
			
			if (i != arr.length-1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i]);
			}
		}
		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int[] arr = new int[n];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;	
//		}
//		
//		for (int i = 1; i <= m; i++) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//		
////			for (int j = 0; j ) {
////				
////			}
//			
//			
//		}
//		
//		for (int i = 0; i < arr.length; i++ ) {
//			
//			if (i != arr.length-1) {
//				System.out.print(arr[i] + " ");
//			} else {
//				System.out.print(arr[i]);
//			}
//		}
//		
//		scan.close();
//		
//	}
//}
		
		scan.close();
	}
}
