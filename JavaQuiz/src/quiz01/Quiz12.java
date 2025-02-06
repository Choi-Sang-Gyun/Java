package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		int[] arr = {1000, 500, 100, 50, 10};
		int money = 17780;
		
		//가장 최선의 방법으로 금액을 거슬러 주면 됩니다.
		
//		System.out.println(money / arr[0]);
//		System.out.println((money % arr[0]) / arr[1]);
//		System.out.println(((money % arr[0]) % arr[1]) / arr[2]);
//		System.out.println((((money % arr[0]) % arr[1]) % arr[2]) / arr[3]);
//		System.out.println(((((money % arr[0]) % arr[1]) % arr[2]) % arr[3]) / arr[4]);
//		
		
		int a = 0;
		
//		while (a < arr.length) {
//			
//			if( a-1 < 0 ) {
//				System.out.println(arr[a] + "원:" + money / arr[a]);
//			} else {
//				System.out.println(arr[a] + "원:" + (money % arr[a-1]) / arr[a]);
//			} 
//			a++;
//			}
		
		while (a < arr.length) {
			System.out.println(arr[a] + "원:" + money / arr[a]);
			money = money % arr[a];
			a++;
		}
		
		}		
	}

		
		
		
		
		

