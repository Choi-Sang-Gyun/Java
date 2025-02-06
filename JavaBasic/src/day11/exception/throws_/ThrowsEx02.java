package day11.exception.throws_;

public class ThrowsEx02 {
	public ThrowsEx02() throws Exception {
		
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
		
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa호출");
		bbb(0);
		System.out.println("aaa종료");
	}
	
	public void bbb(int a) throws Exception {
		System.out.println("bbb호출");
		
		int x = 10/a;
		
//		try {
//			int x = 10/a;
//		} catch (Exception e) {
//		System.out.println("0으로 나눌 수 없습니다");
//		}
		
		System.out.println("bbb호출");
		
	}
	
	public static void main(String[] args) /*throws Exception*/ {
		
		//ThrowsEx02 객체 생성
		
		
		try {
			
			ThrowsEx02 ex = new ThrowsEx02();
			
		} catch ( Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
	
	
}
