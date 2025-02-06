package quiz17;

public class StringQuiz02 {

	/*
	 * 문자열 거꾸로 뒤집기
	 * 
	 * 매개변수로 전달받은 문자열을, 거꾸로 뒤집어서 반환하는 메서드를 생성하세요
	 * 
	 * reverse(String)
	 * 입력 -> abcde
	 * 반환 -> edcba
	 * 
	 */
	
	public String stringquiz02 (String a) {
		
		String[] b = a.split("");
		String c = "";
		
		for(int i = b.length-1; i >= 0; i-- ) {
			c += b[i];
		}
		
		return c;
	}
	
	
	
	
	
}
