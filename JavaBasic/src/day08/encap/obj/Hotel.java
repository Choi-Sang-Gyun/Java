package day08.encap.obj;

public class Hotel {

	private Chef chef;
	private Employee emp;
	
	//호텔이 생성될 때, chef를 같이 생성한다.
	public Hotel() {
		this.chef = new Chef(); //초기화 진행
	}
	
	//chef 변수의 getter, setter
	//setter - 매개변수로 객체를 받는 타입
	public void setChef(Chef chef) {
		this.chef = chef;
		this.emp = new Employee();
	}
	
	//getter - 객체를 반환으로 돌려주는 타입
	public Chef/*반환유형타입*/ getChef() {
		return chef;
	}
	
	//emp - getter, setter
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
}
