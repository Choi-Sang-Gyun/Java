package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*키(double)와 나이(int)를 입력하세요
		 * 키>
		 * 나이>
		 * 놀이기구 탑승이 가능합니다
		 * 탑승 가능 조건 - 키 140이상이고, 나이가 8세 이상이면, 놀이기구 탑승가능
		 * 아니라면 탑승 불가능
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키(double)와 나이(int)를 입력하세요.");
		System.out.print("키>");
		double a = scan.nextDouble();
		System.out.print("나이>");
		int b = scan.nextInt();		
		
		if(a >= 140 && b >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다!");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다!");
		}
		
		scan.close();
		
	}
}
