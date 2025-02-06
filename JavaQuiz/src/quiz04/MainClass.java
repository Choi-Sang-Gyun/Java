package quiz04;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		Arrays.toString()와 똑같은 기능 구현하기
		1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
		2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
		2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
		*/
		
		int[] a = {1,2,3};
		char[] b = {'a', 'b', 'c'};
		String[] c = {"ab", "cd", "ef"};
//		Arraysrr arr = new Arraysrr();
		
		System.out.println(Arraysrr.toArrayrr(a));
		System.out.println(Arraysrr.toArrayrr(b));
		System.out.println(Arraysrr.toArrayrr(c));
		
	}
	
}
