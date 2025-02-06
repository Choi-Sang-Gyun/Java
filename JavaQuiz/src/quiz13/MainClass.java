package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
//		Marine marine = new Marine(0, 0, 0);
//		Unit tank = new Tank(0, 0, 0);
//		DropShip dropship = new DropShip(0, 0, 0);
//		
//		marine.StimPack();
//		dropship.rideUnit("Tank", 2);
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();
		Marine m5 = new Marine();

		Tank t1 = new Tank();
		
		DropShip d1 = new DropShip();
		d1.ride(m1);
		d1.ride(m2);
		d1.ride(m3);
		d1.ride(m4);
		d1.ride(t1);
		
		
		
		
		
	}
	
}
