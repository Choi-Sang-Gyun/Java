package quiz13;

import java.util.Arrays;

public class DropShip extends Unit {

//	public DropShip(int x, int y, int hp) {
//		super(x, y, 60);
//		System.out.println("드랍쉽 한 마리 생산완료");
//	}
//	
//	String[] arr = new String[8];
//	
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
//	public void rideUnit(String unit, int a) {
//		
//		int i = 0;
//		while (i <= a) {
//			if(unit.equals("Marine")) {
//				arr[i] = "Marine";
//				i++;
//			}
//			
//			if(unit.equals("Tank") && i+4 <= a) {
//				arr[i] = "Tank";
//				arr[i+1] = "Tank";
//				arr[i+2] = "Tank";
//				arr[i+3] = "Tank";
//				i = i+4;
//			} else if (unit.equals("Tank") && i+4 > a) {
//				System.out.println("수송선에 공간이 부족합니다");
//				break;
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		}
		
	private Unit[] arr = new Unit[8];
	private int index = 0;
	
	
	@Override
	public void location() {
		System.out.println("현재 위치:" + x +", " + y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치이동:" + x + ", " + y);
	}
	
	public void ride(Unit unit) {
		if(unit instanceof Marine && index <= 7) {
			arr[index] = unit;
			index++;
			
		} else if(unit instanceof Tank && index <= 4) {
			arr[index] = unit;
			index += 4;
			
		} else {
			System.out.println("수송선에 자리가 부족합니다");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
