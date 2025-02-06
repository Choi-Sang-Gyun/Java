package quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 둘째 줄에서 입력의 횟수만큼 정수를 다시 입력을 받습니다
		 * 
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		int[] arr2 = new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt( arr[i]);
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
	
	
}
