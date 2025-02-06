package quiz21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너를 이용해서 파일명을 입력 받습니다.
		 * file폴더 하위에 입력받은 파일명으로 파일을 씁니다
		 * 파일을 쓸 때, "쓰고싶은말"을 사용자에게 입력 받습니다
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String name = scan.next();
		String err = scan.nextLine();
		
		System.out.println("쓰고 싶은 말>");
		String str = scan.nextLine();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+name+".txt";
		
		Writer fw = null;
		Reader rd = null; 
		
		try {
			fw = new FileWriter(path);
			fw.write(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
		
//		try {
//			rd = new FileReader(path);
//			
//			int result;
//			while ( (result = rd.read()) != -1) {
//				System.out.print((char)result);
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rd.close();
//			} catch (Exception e2) {
//			}
//		}
		
		
		
		
		
	}
	
}
