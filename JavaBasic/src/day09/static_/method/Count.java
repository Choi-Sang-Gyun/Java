package day09.static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반메서드 - 일반변수, 정적변수 모두 사용이 가능함
	public int method01() {
		a = 10;
		return ++b;
	}
	
	//정적 메서드 - static 멤버들만 접근 가능함
	//			단, 객체 생성을 통해서는 일반 변수도 사용이 가능			
	public static int method02() {
//		a = 10; // 일반 변수 접근 안됨
		
		Count c = new Count();
		c.a = 1;  // count를 객체로 만들면 가능
		
		
		return ++b;
	}
	
	
	
}
