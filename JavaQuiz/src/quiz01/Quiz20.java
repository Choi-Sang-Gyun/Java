package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		for(int i = 0; i < arr.length; i++) {
			int b = scan.nextInt();
			arr[i] = b; 
		}
			
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
		
		scan.close();
		
	}
}
