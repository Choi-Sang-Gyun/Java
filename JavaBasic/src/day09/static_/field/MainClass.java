package day09.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
	Count c = new Count();
	c.a++;
	c.b++;
	
	System.out.println("a:" + c.a);
	System.out.println("b:" + c.b);
	
	Count c2 = new Count();
	c2.a++;
	c2.b++;
	
	System.out.println("a:" + c2.a);
	System.out.println("b:" + c2.b);
	
	Count c3 = new Count();
	c3.a++;
	c3.b++;
	System.out.println("a:" + c3.a);
	System.out.println("b:" + c3.b);
	
	//static area 라는 곳에 따로 정보가 저장됨 + 단 한개
	
	
	}
}
