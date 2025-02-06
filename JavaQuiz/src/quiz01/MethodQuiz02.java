package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		String str = java(8);
		System.out.println(str);
	
	}
	
	//
	
	static String java(int a) {
		String str = "";
		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				str += "자";
			} else {
				str += "바";
			}		
		}
		return str;
	}
	
	

}
