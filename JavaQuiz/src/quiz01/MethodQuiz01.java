package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
	method1();
	System.out.println(  method2("그래") );
	System.out.println(  method3(1, 1, 3) );
	System.out.println(  method4(2) );
	method5("그래!", 2);
	System.out.println(  maxNum(1, 2) );
	System.out.println( abs(-1) );
	
	char[] arr = {'a','b','c'};
	System.out.println( method6(arr) );
	
	int[] arr2 = {1,2,3,4,5};
	System.out.println(method7(arr2));
	
	String[] arr3 = method8("홍길동", "이순신");
	System.out.println(Arrays.toString(arr3));
		
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String a) {
		return a;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		
		if (a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
	static void method5(String a, int b) {
		for (int i = 1; i <= b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	static int abs(int a) {
		if (a<0) {
			return -a;
		} else {
			return a;
		}
	}
	
	static String method6(char[] a) {
		String sum = "";
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
		
	}
	
	static int method7(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static String[] method8(String s1, String s2) {		
		String[] a = {s1, s2};
		return a;
	}
	
	
}
