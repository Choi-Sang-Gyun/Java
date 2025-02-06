package day08.modi.Member.pac1;

public class B {

	A a = new A(1); //public
	A a2 = new A("홍길동"); //default
//	A a3 = new A(true); //private(x) - 외부 호출 불가/외부접근 불가
	
	public B() {
		//요기에서 A 안에 변수를 사용하고 싶으면?
		A a4 = new A();
		a4.a=1;
		a4.b=1; //
	//	a4.c=1; //private
		
		a4.method01();
		a4.method02();
	//	a4.method03(); // private
		
		
	}
	
	
	
	
	
}
