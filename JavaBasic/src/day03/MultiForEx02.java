package day03;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		//바깥 반복문에 따라서 안쪽 반복문의 회전수가 달라지는 경우
//		for(int i =1; i<=9; i++) {
//			
//			for(int j = 1; j<= i; j++ ) {
//				System.out.println(i + "-" + j);
//			}
//		}
		
		//조건이 바뀌는 for문
		//바깥 반복문 - 행
		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 
		 형식의 출력물을 만들기
		 */
		int star = 5;
		
//		for (int i = 1; i <= star; i++) {
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-------------------------");
//		
//		for (int a=1; a <= star; a++) {
//			for (int b = star; b >= a; b--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-------------------------");
		
		for (int c = 1; c <= star; c++) {
			
			for (int d = 1; d <= star-c; d++) { //공백
				System.out.print(" ");
			}
			
			for (int d = 1; d <= c*2-1; d++) { //별을 출력
				System.out.print("*");
			}
				
			for (int d = 1; d <= star-c; d++) { //공백
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}
}
