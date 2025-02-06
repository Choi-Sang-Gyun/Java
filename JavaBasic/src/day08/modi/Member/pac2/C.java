package day08.modi.Member.pac2;

import day08.modi.Member.pac1.*;


public class C {
	
	A a = new A(1); //public
//	A a2 = new A("홍길동"); //default(x) - 다른 패키지 호출 불가
//	A a3 = new A(true); //private(x) - 외부 호출 불가/외부접근 불가

	public C() {
	
	A a4 = new A();
	a4.a=1;
//	a4.b=1; //default
//	a4.c=1; //private
	
	a4.method01();
//	a4.method02(); //default
//	a4.method03(); // private
	}
}
