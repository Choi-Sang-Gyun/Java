package quiz13;

public class Marine extends Unit{

//	int attack;
//	int armor;
//	
//	public Marine(int x, int y, int hp) {
//		super(x, y, 60);
//		this.attack = 6;
//		this.armor = 0;
//		System.out.println("마린 한 마리 생산완료");
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
//	public void StimPack() {
//		attack++;
//		System.out.println("스팀팩 사용");
//	}
	
	public static int attack = 6;
	public static int armor = 0;
	
	public Marine() {
		this.hp = 60;
	}
	
	
	@Override
	public void location() {
		System.out.println("현재 위치:" + x +", " + y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치이동:" + x + ", " + y);
	}
	
	public void stimPack() {
		attack += 1;
	}
	
	
	
}
