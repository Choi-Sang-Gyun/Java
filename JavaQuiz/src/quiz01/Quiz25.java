package quiz01;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for (int i = 1; i <= a; i++ ) {
			
			String str = scan.next();
			int b = str.length();
			char c = str.charAt(0);
			char d = str.charAt(b-1);
			
				
			System.out.println(c + "" + d);
		
		}
		
		scan.close();
		
		
	}
}
