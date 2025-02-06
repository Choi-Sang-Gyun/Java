package day02;

public class CastingEx03 {
	
	public static void main(String[] args) {
		
		char c = 'A';
		int i = 2;
		
		//1. 서로 다른 타입에서 연산의 결과는 큰 타입을 따라갑니다.
		char cc = (char)(c + i) ; // 먼저 더한 값을 char로 캐스팅 해라
		System.out.println(cc); // 65+2, 67은 아스키로 C
		
		
		int j = 10;
		double d = 3.14;
		
		int result = (int)(j + d);
		System.out.println(result);
		
		//2. int 보다 작은 타입의 연산 결과는 무조건 int가 된다 (기준이 int)
		byte a = 10;
		byte b = 20;
		
		byte result2 = (byte)(a + b) ;
		
		System.out.println('A' + 10); // char + int = int
		
		byte bb = 10;
		short ss = 20;
		
		short result3 = (short)(bb + ss);
		
		
		
	}
	
}
