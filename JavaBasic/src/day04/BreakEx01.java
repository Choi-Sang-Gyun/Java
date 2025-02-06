package day04;

public class BreakEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if(i == 5) break; // 실행시킬 구문이 1개면 {} 생략가능
//		}
		
		
		/*
		 * 무한 반복문
		 * - 반복문의 횟수를 정확히 모를 때 주로 사용합니다.
		 * 언제까지 계속 받을 겁니다 (2라는 값이 들어올때까지 받겠습니다)
		 * 자바에서는 while(true) 문장을 많이 사용합니다
		 */
		
		int i = 1;
		while(true) {
			System.out.println(i);
			
			if (i==15) {
				break;
			}
			i++;
		}
		
	}
}
