package quiz16;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		
		/*
		 * 1.정수 2개를 입력받습니다
		 * 2. 입력된 값이 정수라면 단순히 합계를 반환해주면 됩니다
		 * 3. 예외가 발생하면, catch안에서 예외를 다시한번 생성하고, throws 처리합니다
		 * 4. scan.close는 finally 구문에서 처리합니다
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
	
		int c = 0;
		
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			c = a+b;
			
		} catch (Exception e) {
			
			throw new Exception();
			
		} finally {
			
			scan.close();
		}
		return c;
	}
	
	
	
	
	
	
}
