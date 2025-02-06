package day01;

public class SystemOut {

	public static void main(String[] args) {
		//main이라고 쓰고 ctrl + space 누르면 실행함수 자동생성
		//sysout이라고 적고 ctrl + space 출력물 생성

		//단축키
		/*
		 * 한 줄 주석 : ctrl + /
		 * 한 줄 코드 이동 : alt + 방향키
		 * 행복사(한줄코드복사) : ctrl + alt + 방향키
		 * 영역지정 : shift + 방향키 (줄 단위)
		 * 영역지정 : shift + home /or/ end (한 줄 내)
		 * 정렬 : 전체선택(ctrl + a) 후 ctrl + i
		 * 
		 * 프로젝트의 import : 가져오기 general탭 -> project into workspace 선택
		 * 프로젝트의 export : 내보내기 general탭 -> archive 선택
		 * 
		 */

		//1. println(개행(\n)을 마지막에 포함)
		System.out.println("곧 쉬는 시간이네");
		System.out.println("아 나는 집에 가야겠다. 나만 간다");

		//2. print() - 개행 미포함
		System.out.print("줄바꿈 없다~\n");
		System.out.print("줄바꿈\t없다~\n");

		//3. printf() - 형식 지정 출력문
		/*
		 * 서식문자
		 * \n - 줄바꿈
		 * \t - 탭버튼 정렬 
		 * %d - 정수를 받음
		 * %s - 문자를 받음
		 * %f - 실수를 받음
		 */
		System.out.printf("맨 처음에 하고 싶은 말을 적습니다. %s은 %d월 %d일 입니다.", "오늘", 12, 30);
		System.out.printf("\n원주율은 %f입니다", 3.141592);
		System.out.printf("\n원주율은 %.2f입니다", 3.14); //%.2f 소수 2자리 까지만 표현

		//이 구문에서 printf 문장으로 숫자는 모두 %d로 표현해 보세요.

		System.out.printf("\n%dx%d=%d %dx%d=%d", 2, 1, 2, 2, 2, 4);

	}
}
