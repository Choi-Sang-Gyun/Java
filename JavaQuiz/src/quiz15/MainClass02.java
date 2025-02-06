package quiz15;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		
		/*
		 * updown 게임
		 * 1~100 사이의 정답이 주어지고, 사용자는 정답을 맞추는 게임
		 * 정답보다, 입력값이 작다면 "더 큰 값을 입력하세요"
		 * 정답보다, 입력값이 크다면 "더 작은 값을 입력하세요"
		 * 를 출력합니다
		 * 
		 * 정답을 맞추면, 정답 횟수를 출력해주면 됩니다
		 * 잘못된 값을 입력한 경우에 에러처리를 하고, 정답 횟수를 증가시켜주세요
		 * 
		 */
		
		int result; //정답
		int t = 0; //시도 횟수
		Scanner scan = new Scanner(System.in);
		
		result = (int)(Math.random()*99)+1;
			
			while(true) {				
				try {
				
					int a = scan.nextInt();
					t++;
		
					if(a > result) {
						System.out.println("더 작은 값을 입력하세요");
					} else if (a < result) {
						System.out.println("더 큰 값을 입력하세요");
					} else {
						System.out.println("정답입니다" + "\n정답횟수:" + t);
						break;
					}
			
				} catch (Exception e) {
				System.out.println("값을 잘못 입력 하셨습니다");
				String str = scan.next();
				}
			}
	}
	
	
}
