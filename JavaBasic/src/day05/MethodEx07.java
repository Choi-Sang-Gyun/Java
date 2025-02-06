package day05;

import java.util.Arrays;


public class MethodEx07 {

	public static void main(String[] args) {
		
		//call by value vs call by reference
		
		int a = 1;
		value(a); // 기본타입 변수는 값을 복사해서 전달시킴
		System.out.println(a); //1
		//아래 메서드의 int a 와 위의 int a는 이름이 같을 뿐이지, 다른 a다
		
		System.out.println("--------------------------");
		int[] arr = new int[]{1,2,3,4,5};
		System.out.println(arr);
		reference(arr/*배열*/); //주소값
		System.out.println(Arrays.toString(arr));
		
	}
	
	//call by value
	static void value(int a) {
		a = 100;
	}
	
	static void reference(int[] x) { //주소값
		x[0] = 1000;
		x[1] = 900;
		x[2] = 800;
	}
	

	
	
	
}
