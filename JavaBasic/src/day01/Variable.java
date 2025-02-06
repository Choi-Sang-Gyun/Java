package day01;

public class Variable {

	public static void main(String[] args) {
		
		/*
		 * 변수의 선언방법
		 * 데이터 타입 이름;
		 * 
		 * int는 정수를 저장하는 대표적인 유형
		 * String은 문자열을 저장하는 대표적인 유형
		 */
		
		int a; // 변수의 선언
		a = 10; //초기화 과정
		
		System.out.println(a);
		
		int a2 = 20; // 변수선언과 초기화 동시에
//		int a = 30; // 동일한 이름으로 변수를 생성할 수 x
		
		System.out.println(a2);
		
		int b = a + a2 + 30; // 다른 변수의 값, 연산의 결과도 저장할 수 있음
		b = 100;
		
		System.out.println(b);
		
		String d = "문자";
		System.out.println(d);
				
	}
	
}
