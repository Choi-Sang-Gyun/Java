package quiz01;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100 사이의 정수들 중에서 7의 배수를 가로로 출력
		
		for (int a = 7; a <= 100; a++) {
			if (a % 7 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println(" ");
		
		//줄바꿈
		//2. 200까지 정수 중에서 8의 배수의 개수를 출력
		
		int i = 0;
		for (int a = 1; a <= 200; a++) {
			if (a % 8 == 0) {
				i++;
			}
		}
		System.out.println(i);
		
		//3. 50~100 사이의 짝수의 합
		
		int sum = 0;
		for (int a = 50; a <= 100; a++) {
			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);
		
		//4. A~Z까지 문자열의 합을 구하세요 ABCDE....Z
		//A = 65, Z = 90
		
//		int sum2 = 0;
//		for(int a = 65; a <= 90; a++) {
//			sum2 += a;
//		}
//		
//		System.out.println(sum2);
		
		String str = ""; //초기값을 공백으로 
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		System.out.println(str);
		
		
		
	}
}
