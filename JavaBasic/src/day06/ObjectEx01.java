package day06;

public class ObjectEx01 {
	
	public static void main(String[] args) {
		
		//객체를 사용하지 않는다면
		System.out.println("---1번 계산기---");
		System.out.println(add(10));
		System.out.println(add(20));
		System.out.println(add(30));
		
		System.out.println("---2번 계산기---");
		System.out.println( add (100));
	
		//객체를 사용한다면
		System.out.println("----------------------");
		System.out.println("---------1번 계산기------");
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(10));
		System.out.println(cal.add(20));
		System.out.println(cal.add(30));
		
		System.out.println("-----------2번계산기-------");
		Calculator cal2 = new Calculator();
		System.out.println(cal2.add(20));
		
		
		
	}
	
	static int result = 0;
	static int add(int a) {
		result += a;
		return result;
	}
	
	static int result2 = 0;
	static int add2(int a) {
		result2 += a;
		return result2;
	}
	
}
