package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 타입을 큰 타입에 대입하면 자동으로 형변환을 해줍니다.
		 * JVM(자바 버추얼 머신)이 해줌
		 */
		
		byte b = 10;
		short c = b; // byte 형에서 short 형으로 자동 형변환
		int i = b; // byte -> int 형 자동 형변환
		long l = b;
		
		char cc = 'A';
		int ii = cc; //char -> int 자동형변환
		
		System.out.println(ii);
		
		int k = 10;
		double d = k;
		System.out.println(d); // int -> double 자동형변환 
		
	}
	
}
