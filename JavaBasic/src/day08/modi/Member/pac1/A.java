package day08.modi.Member.pac1;



public class A {

	public A(int i) {}
	A(String s) {}
	private A(boolean b) {} //박에서 객체 생성을 못하게 할때, 생성자 private를 붙인다

	///////////////////////////////////
	
	public int a;
	int b;
	private int c;
	
	public A() {
		a=1;
		b=2;
		c=3;
		method01();
		method02();
		method03();
	} //생성자
	
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	
	
	
	
}
