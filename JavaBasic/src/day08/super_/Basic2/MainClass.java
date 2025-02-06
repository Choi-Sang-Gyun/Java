package day08.super_.Basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20 ,"121412");
		System.out.println(s.info());
		
		//teacher, employee도 생성자를 만들고, 객체 생성해주세요
		
		Teacher t = new Teacher("홍길동", 30, "국어");
		System.out.println(t.info());
		
		Employee e = new Employee("홍길동", 40, "회계");
		System.out.println(e.info());
		
	}
	
	
}
