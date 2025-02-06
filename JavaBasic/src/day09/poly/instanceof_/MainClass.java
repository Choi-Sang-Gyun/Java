package day09.poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Student("홍길동", 10, "123");
		Person park = new Teacher("박찬호", 20, "체육");
		Person choi = new Employee("최강창민", 30, "가수");
		
		printPerson(choi);
		
		
		
		
	}
	
	public static void printPerson(Person p) {
		
		//p가 Student 였으면 Student캐스팅
		//p가 Teacher였으면 Teacher캐스팅
		
		if(p instanceof Student) { //p가 student 였으면 true
			Student s = (Student)p;
			System.out.println("p는 원래 Student 였음");
			System.out.println(s.info());
			
		} else if (p instanceof Teacher) { //p가 teacher였으면 true
			Teacher t = (Teacher)p;
			System.out.println("p는 원래 Teacher 였음");
			System.out.println(t.info());
			
		} else if(p instanceof Employee) { //p가 employee였으면 true
			Employee e = (Employee)p;
			System.out.println("p는 원래 Employee 였음");
			System.out.println(e.info());
		}
		
	}
	
	
	
	
}
