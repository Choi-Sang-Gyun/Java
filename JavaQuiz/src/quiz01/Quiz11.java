package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 첫째줄에 n 정수가 주어집니다.
		 * 이후부터는 n줄에 걸쳐서 정수를 입력받습니다.
		 * 이 입력받은 값을, 배열에 순서대로 저장
		 * 
		 * 배열의 크기
		 * int[] arr = new int[크기]
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n]; // 입력받은 값만한 배열을 생성
		
		int i = 0;
		while (i < n) {
			
			//입력 받은 값을 배열에 넣는다
			arr[i] = scan.nextInt();
			i++;
		}
	
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}
}
