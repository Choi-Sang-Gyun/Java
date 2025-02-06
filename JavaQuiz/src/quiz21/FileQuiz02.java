package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 날짜 클래스를 이용해서 file 경로에 20250124.txt 이름으로 파일을 씁니다
		 * 2. 내용은 "그만" 을 입력할 때까지 작성해주면 됩니다.
		 * 3. 파일을 썻다면 BufferedReader를 이용해서 파일의 내용을 읽어들이세요
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		LocalDate now = LocalDate.now();
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now +".txt";
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path, true));
			
			System.out.println("내용 입력");
			
			while (true) {
				System.out.print(">");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					break;
				} 
			
				str += "\r\n" ;
				bw.write(str);				
			}
			
			bw.flush();
			
			br = new BufferedReader(new FileReader(path));
			
			String str2;
			while((str2 = br.readLine()) != null) {
				System.out.println(str2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				scan.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
		
	}
	
}
