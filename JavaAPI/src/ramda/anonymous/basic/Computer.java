package ramda.anonymous.basic;

public class Computer {

	private int sound;
	private RemoteControl remote;
	
	public Computer() {
		
		remote = new RemoteControl() {
			
			@Override
			public void volumUp() {
				sound++;
				System.out.println("콤퓨타 볼륨:" + sound);
			}
			
			@Override
			public void volumDown() {
				sound--;
				System.out.println("콤퓨타 볼륨:" + sound);
			}
			
			@Override
			public void turnOn() {
				System.out.println("컴퓨터를 킵니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("컴퓨터를 끕니다");
			}
		};
	}
	
	
	
}
