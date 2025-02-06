package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		
		String str = new String (new char[] {'h', 'e', 'l', 'l', 'o'});
		
		System.out.println(str);
		
		//다양한 기능
		
		//문자열 자르기 - 인덱스 번호
		char a = str.charAt(0);
		System.out.println(a);
		
		//문자열 길이
		System.out.println( str.length());
		
		//문자열 찾기
		System.out.println( "문자열을 찾은 위치: " + str.indexOf("l") );
		System.out.println( "문자열을 3번째 인덱스부터 찾은 위치: " + str.indexOf("l", 3) );
		System.out.println( "문자열을 뒤에서부터 찾은 위치: " + str.lastIndexOf("l"));
		System.out.println( "찾는 문자가 없으면: " + str.indexOf("야"));
		
		//문자열 변경 - 발견되는 모든 문자
		String b = "안녕하세요! 문자열은 문자의 합입니다";
		String b2 = b.replace("문자", "word"); // 타겟문자, 바꿀 문자
		System.out.println(b2); // 새로운 문자열을 반환
		
		System.out.println(b); //원본문자는 그대로
		
		b = b.replace("문자", "word");
		System.out.println(b);
		
		b = b.replace(" ", "");
		System.out.println(b);
		
		//대소문자 변경
		String c = "abcDEF";
		System.out.println(c.toUpperCase());
		System.out.println(c.toLowerCase());
		
		//양쪽 공백 제거 trim
		String d = "   오늘은 월요일  입니다       ";
		System.out.println(d.trim());
		
		//문자열 자르기 substring
		String e = "자바 칩 프라프치노";
		System.out.println( e.substring(4)); // 4미만 절살
		System.out.println( e.substring(0,3)); // 4미만 절살
		
		//문자열 비교
		System.out.println("홍길동".equals("홍길동"));
		
		
		//문자열 자르기 split()
		String f = "010-1234-5678";
		
		String[] arr = f.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = f.split("");
		System.out.println(Arrays.toString(arr2));
	
		//문자열 자르기 toCharArray
		char[] arr3 = f.toCharArray();
		System.out.println(arr3);
	
		//문자열 합치기
		String r = String.join("->", "java", "is", "cool");
		System.out.println(r);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
