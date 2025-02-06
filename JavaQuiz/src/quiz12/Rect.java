package quiz12;

public class Rect extends Shape {

	private int a;
	private int b;
	
	public Rect(String name, int a, int b) {
		super(name);
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		return a*b;
	}

	//사각형은 생성될 때 이름과, 변의 길이를 받도록 처리하고,
	//getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인

	
}
