package day09.static_.method;

public class MainClass {

	public static void main(String[] args) {
		
		// static 멤버는 객체생성 없이 접근이 됩니다
		Count.b = 1;
		Count.method02();
		
		//객체 생성
//		Count c = new Count();
//		c.a = 1;
		
		MainClass m = new MainClass();
		
//		public void example1() {
//			System.out.println("Hello World");
//		}
		
		
	}
	
}
