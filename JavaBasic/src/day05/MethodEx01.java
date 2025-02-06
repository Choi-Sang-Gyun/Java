package day05;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 함수는 만들고, 사용하는 과정(호출)이 있습니다
		 * 메서드 안에는 메서드를 선언할 수 없습니다
		 * (메인 안에 메서드 제작 불가능)
		 * 
		 * 
		 */
		
		//멋진기능
		System.out.println(sumNum());
		
		/*
		 * 리턴의 값이 나의 자리로 돌아왔다
		 */
	
		int num = sumNum();
		System.out.println(num);
		
		//문자열을 반환하는 함수~
		String result = randomStr();
		System.out.println(result);
		
	}
	
	//함수
	static int/*정수를 반환 (반환타입)*/ sumNum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;/*돌려줄 값;*/
	}
	
	
	//함수
	static String randomStr() {
		
		String str = "";
		for (char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str; /*null : 아직 돌려줄 값이 없을때 임시로 취하는 조치*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
