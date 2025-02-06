package day09.poly.basic02;

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
