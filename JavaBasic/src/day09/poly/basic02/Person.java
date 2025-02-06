package day09.poly.basic02;

public class Person {
	
	//공통클래스(부모클래스)로 사용
	
	String name;
	int age;
	
	//생성자 연결
	//1.중복되는 프로그램 코드를 생성자 연결을 통해서 줄여줄 수 있음
	//2.this()는 생성자의 첫번째 줄에 있어야 한다
	
	Person(String name, int age) {
		this.name/*멤버변수*/ = name/*매개변수*/;
		this.age = age;
//		System.out.println(this); // 나의 주소값
	}
	
	Person(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1); //위에 있는 Person 생성자1에게 다시 돌려줘서 똑같이 저장해줌
	}
	
	Person() {
//		this.name = "이름x";
//		this.age = 1;
		this("이름x", 1); // 위에 직접 입력한 코드와 같은 결과 가능
	}
	
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
	
	
}
