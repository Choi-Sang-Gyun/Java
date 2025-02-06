package ramda.anonymous.basic;

//인터페이스 선언
interface Car {
	void run();
}
//카를 구현하는 클래스를 만들어야 한다
class Tico implements Car {

	@Override
	public void run() {
		System.out.println("티코~");
	}
}
//이런식으로 모든 차에 대응하는 class를 만들어야 한다
//불가능

public class Garage {
//	public Car car = new Tico();
	
	//딱 한번만 사용하고, 재활용 할 생각이 없는 클래스는 익명객체로 생성할 수 있음
	public Car car = new Car() {
		
		public void run() {
			System.out.println("익명객체 티코입니다");
		}
	};
	
	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();
		
	}
	
	
	
	
}
