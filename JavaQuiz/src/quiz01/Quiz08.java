package quiz01;



public class Quiz08 {

	public static void main(String[] args) {
		
		String[] arr = { "안녕하세요", "hello", "니하오", "*~$%" };
				
		
		/*
		 * 랜덤한 배열의 요소를 선택하고, 이 랜덤한 배열 요소에 따른 국가별 언어를 출력하면 됩니다.
		 * 
		 */
		
		int a = (int)(Math.random() * arr.length);
		System.out.println("선택된 단어:" + arr[a]);
		
		
		switch (a) {
		case 0:
			System.out.print("한국어 ");
			break;
		case 1:
			System.out.print("영어 ");
			break;
		case 2:
			System.out.print("중국어 ");
			break;
		default:
			System.out.print("알 수 없는 언어 ");
			break;
		}
		
		System.out.print("입니다");
		
	}
}
	

