package quiz13;

public class Tank extends Unit {

//	public Tank(int x, int y, int hp) {
//		super(x, y, 100);
//		System.out.println("탱크 한 마리 생산완료");
//	}
//
//	@Override
//	public void location() {
//		System.out.println("현재 위치:" + getX() +", " + getY());
//	}
//
//	@Override
//	public void move(int x, int y) {
//		setX(x);
//		setY(y);
//		System.out.println("현재 위치:" + getX() + ", " + getY());
//	}
//
//	@Override
//	public void stop() {
//		System.out.println("현재 위치:" + getX() + ", " + getY() + "에 정지함");
//	}
//
//	public void changeMode() {
//		System.out.println("공격모드를 변경함");
//	}
	
	private boolean changeMode = false;
	
	public Tank() {
		this.hp =100;
	}
	
	@Override
	public void location() {
		System.out.println("현재 위치:" + x +", " + y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치이동:" + x + ", " + y);
	}
	
	public void changeMode() {
		changeMode = !changeMode;
	}
	
	
	
}
