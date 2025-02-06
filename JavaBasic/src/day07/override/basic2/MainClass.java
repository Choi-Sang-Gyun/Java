package day07.override.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); //그렇게 많이 쓸 일은 없어 (공통 내용만 가지고 있으니까/객체 생성은 가능)
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.studentId="123123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "홍길자";
		t.age = 40;
		t.subject = "역사";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name = "쬬";
		e.age = 50;
		e.department = "회계";
		System.out.println(e.info());
		
	}
	
	
}
