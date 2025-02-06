package day03;

public class EnhancedForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//일반 반복문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//향상된 for문
		for (int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("--------------------------");
		
		String[] arr2 = {"월", "화", "수", "수", "수", "토", "일"};
		
		for (String a : arr2) {
			System.out.println(a);
		}
		
		System.out.println("--------------------------");
		
		int[] point = {34, 56, 12, 96, 98}; //배열요소의 합계와 평균
		int a = 0;
		
		for ( int b : point ) {
			a += b;
		}
		System.out.println("합계:" + a);
		System.out.println("평균:" + (double)a / point.length);
		
	}
}
