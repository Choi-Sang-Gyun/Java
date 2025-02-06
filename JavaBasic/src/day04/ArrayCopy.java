package day04;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//복사의 개념 2개가 있음
		//얕은 복사
		//깊은 복사
		
		int[] arr = {1,2,3,4,5};
		int[] newArr = arr; //얕은 복사, 주소값을 본떠서 집어넣는거
		
		System.out.println("newArr:" + Arrays.toString(newArr));
		
		//깊은 복사 - 완전히 새로운 배열을 만들고, 요소를 옮겨 담는다
		int[] arr2 = new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(arr == arr2);
		arr2[0] = 200;
		
		System.out.println("원본:" + Arrays.toString(arr));
		System.out.println("원본:" + Arrays.toString(arr2));
		
		
		
		
		
	}
}
