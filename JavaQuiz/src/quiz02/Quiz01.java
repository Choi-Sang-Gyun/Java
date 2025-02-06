package quiz02;

public class Quiz01 {

	public static void main(String[] args) {
		
		  /*
		멤버변수
		회사명 - String
		채널번호 - int
		전원 - boolean
		
		생성자
		기본 생성자는 회사명을 초기화 LG
		
		메서드
		정보출력 - info() : 반환 void - 티비의 정보를 출력
		채널변경 - changeChannel(int) : 반환 int - 현재 채널을, 전달받은 값으로 변경하는 기능
		전원켜기 - power() : 반환 void - 전원을 껐다 켰다 하는기능
		
		*/
		
		TV tv = new TV();
		
		tv.power();
		tv.power();
		tv.info();
		tv.changeChannel(3);
		tv.power();
	}
	
}
