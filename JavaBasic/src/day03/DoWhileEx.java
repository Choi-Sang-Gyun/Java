package day03;

public class DoWhileEx {

	public static void main(String[] args) {
		
		//dowhile - 조건이 false 여도 무조건 1번은 실행됨 / 2회전부터는 while 문과 동일
		
		int i = 1;
		do {
			
			//코드...
			System.out.println(i);
			
			i++;
		} while ( i <= 10);
		
	}
}
