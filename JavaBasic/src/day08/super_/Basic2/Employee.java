package day08.super_.Basic2;

public class Employee extends Person {

	String department;
	
	Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	@Override
	String info() {
		
		return super.info() + ", 분야:" + department;
	}
	
	
	
}
