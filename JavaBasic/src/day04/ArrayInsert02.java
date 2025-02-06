package day04;

import java.util.Arrays;

public class ArrayInsert02 {

	public static void main(String[] args) {
		
		
		int[] arr = {10,20,30,40,50};
		
		int data = 100; //추가할 데이터
		int target = 2; //추가할 위치, 인덱스번호
		
		int[] newArr = new int[arr.length+1];
		
		//복사
		for(int i =0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//배열의 마지막부터 ~ 타겟 인덱스까지 값을 옮겨담는 작업
		for(int i = newArr.length-1; i > target; i--) {
			newArr[i] = newArr[i-1];
		}
		
		//타겟인덱스 자리에 데이터를 추가
		newArr[target] = data;
		
		arr = newArr; // 원본 배열을 새로운 배열로 바꿔치기(복사)
		newArr = null; // 새로운 배열은 삭제
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}
