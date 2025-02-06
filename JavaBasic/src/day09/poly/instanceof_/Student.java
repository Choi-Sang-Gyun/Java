package day09.poly.instanceof_;

//상속이 없다면? 비슷한 클래스는
public class Student extends Person {

	String studentId;
	
	Student (String name, int age, String studentId) {
//		super();
//		this.name = name;
//		this.age = age;
		
		super(name, age); // 부모님이 가지고 있는 name, age에 한번에 저장함
		
		this.studentId = studentId;
	}
	
	
	@Override //어노테이션 - 특정 기능을 표현
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
	
	
	
}
