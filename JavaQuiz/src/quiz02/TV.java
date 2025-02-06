package quiz02;

public class TV {

	String companyName;
	int channelNum;
	boolean onOff;
	
	TV() {
		companyName = "LG" ; 
	}
	
	void info() {
		System.out.println("TV의 정보입니다.");
		System.out.println("회사명:" + companyName);
		System.out.println("채널번호:" + channelNum);
		if (onOff == false) {
			System.out.println("전원여부: 꺼졌습니다");
		} else {
			System.out.println("전원여부: 켜졌습니다");
		}
		
	}
	
	int changeChannel(int a) {
		channelNum = a;
		System.out.println("채널이 " + channelNum + "로 변경되었습니다");		
		return channelNum;
	}
	
	void power() {
		onOff = !onOff;
		if (onOff == false) {
//			onOff = true;
			System.out.println("TV가 켜졌습니다");
		} else {
//			onOff = false;
			System.out.println("TV가 꺼졌습니다");
		}
		
		
	}
	
	
	
}
