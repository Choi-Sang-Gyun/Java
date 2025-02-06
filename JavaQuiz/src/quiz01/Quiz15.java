package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로 길이를 입력 받습니다.
		 * 가로,세로 길이의 사격형을 출력하면 됩니다.
		 * 단, 윤곽만 나타나도록 출력 하면 됩니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int a = scan.nextInt(); //가로
		System.out.print("세로>");
		int b = scan.nextInt(); //세로
		
		for (int x = 1; x <= b; x++)
			for ( int z = 1; z <= a; z++) {
				
				if (x == 1 || x == b) { //첫 행과 마지막 행
					System.out.print("*");
				} else { // 첫 행, 마지막행 아닐 때
					if (z == 1 || z== a) {//첫 열, 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					System.out.println();
				}
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i = 1; i <= a; i++) {
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		
////		if (a-2 > 0) {
////			for (int i = 1; i <= b-2; i++) {
////				System.out.print("*");
////				for (int j = 1; j <= a-2; j++) {
////					System.out.print(" ");
////				}
////				System.out.println("*");
////			}
////		} else if (a-2 == 0) {
////			for (int i = 1; i <= b-2; i++) {
////				System.out.println("**");
////			}
////		} else {
////			for (int i = 1; i <= b-2; i++) {
////				System.out.println("*");
////			}
////		}
//		
//		for (int i = 1; i <= b-2; i++) {
//			
//			System.out.print("*");
//			
//			if (a-2 > 0) {
//				for (int j = 1; j <= a-2; j++) {
//					System.out.print(" ");
//				}
//			} else {
//				for (int j = 1; j <= a; j++) {
//					System.out.print("*");
//				}
//			
//			System.out.println("*");
//		
//			}
//			for (int j = 1; j <= a; j++) {
//				System.out.print("*");
//			}
//		}
	
	scan.close();
	
	}
}





//	for (int i = 1; i <= b-2; i++) {
//		
//		if (a-2>0) {
//		System.out.print("*");
//		for (int j = 1; j <= a-2; j++) {
//			System.out.print(" ");
//		}
//		System.out.println("*");
//	} else if (a-2 == 0) {
//	
//	for (int i = 1; i <= b-2; i++) {
//		System.out.println("**"); 
//	} else {
//	for (int i = 1; i <= b-2; i++) {
//		System.out.println("*"); }
	