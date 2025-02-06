package quiz17;

public class PalindromWord {

	public boolean palindromword(String word) {
		
//		String[] arr = word.split("");
//		String a = new String("");
//		
//		for(int i = arr.length-1; i>=0; i-- ) {
//			a += arr[i];
//		}
//		
//		if( word.equals( a)) {
//			return true;
//		} else {
//			return false;
//		}
		
		//문자의 양 끝을 비교해서 같으면
//		for(int i = 0; i < word.length() / 2; i++) {
//			
//			if(word.charAt(i) != word.charAt( word.length()-1-i )) {
//				
//				return false;
//			}
//		}
		
		
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();	
		
		//문자열과 sb는 타입이 다르기 때문에 string으로 바꿔줘야함
		//안그럼 비교가 어려움
		String newWord = sb.toString();
	
		return word.equals(newWord);
	
		// -> 줄여서 쓰면
//		return new StringBuilder(word).reverse().toString().equals(word);
		
	}
}
