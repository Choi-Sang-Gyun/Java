package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {
		
		//StringTokenizer클래스 -특정 문자를 기준으로 잘라서 사용할때 사용 (split과 유사)
		String str1 = "오늘 날씨는 미세먼지가 많고, 매우 추워요.";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		
		System.out.println(token1.countTokens()); //잘린 문자의 개수
		
		//반복을 돌려서 확인
		// -1 번째에 대기하고 있다가 다음 값으로 넘어가며 확인
		//반복자
		
//		System.out.println( token1.nextToken());
//		System.out.println( token1.nextToken());
//		System.out.println( token1.nextToken());
//		System.out.println( token1.nextToken());
//		System.out.println( token1.nextToken());
//		System.out.println( token1.nextToken());
//		System.out.println( token1.nextToken());
		
		//다음이 있는지 확인하고, 전진
		
		while(token1.hasMoreTokens()) { //다음이 있으면 true, 없으면 false
			System.out.println(token1.nextToken());
		}
		
		System.out.println("======================");
		
		String str2 = "2025/01/21/월요일/홍길동/서울시";
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		// /를 기준으로 자름
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("=============================");
		String str3 = "2025.01.21/월요일/홍길동,서울시,마포구,강남구";
		StringTokenizer token3 = new StringTokenizer(str3, ",./"); //구분자도 토큰에 포함시켜줌
		// ,./ 기준으로 자름
		
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
