package day03;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수>");
		int point = scan.nextInt();
		
		//학점
		String grade = null;
		
		if(point >= 90) {

			//if 문의 중첩
			if(point >= 95) {
				grade = "A+학점";
			} else { //90~94 라고 봐야함
				grade = "A학점";
			}
		
		} else if(point >= 80) { //80~89 점, 왜냐면 90점 이상은 위에서 걸러짐
			grade = "B학점";
		} else if(point >= 70) { //70~79 점, 왜냐면 90점 이상은 위에서 걸러짐
			grade = "C학점";
		} else {
			grade = "F학점~ 재수강이네유!";
		}
		
		//학점을 여기서 사용....
		System.out.println("당신의 학점은: " + grade + "입니다.");
		
		
		scan.close();
		
		
		
		
		
		
		
	}
}
