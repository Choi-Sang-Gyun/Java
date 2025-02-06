package quiz01;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		int b = scan.nextInt();
		
		char c = a.charAt(b-1);
		System.out.println(c);
		
		scan.close();
		
	}
}
