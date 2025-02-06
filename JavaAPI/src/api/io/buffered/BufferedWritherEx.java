package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWritherEx {

	public static void main(String[] args) {
		
		/*
		 * 2바이트 기반에 성능향상 보조 스트림 BufferWriter
		 * 
		 * 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text02.txt";
		Scanner scan = new Scanner(System.in);
		
		BufferedWriter bw = null; 
				
		try {
			bw = new BufferedWriter(new FileWriter(path, true));
			//true를 안주면 덮어쓰기, true를 주면 기존 파일이 있을 경우 이어서 작성하게 됩니다
			
			while(true) {
				System.out.print(">");
				String str = scan.nextLine();
				
				if(str.equals("exit")) {
					break;
				}
				
				str += "\r\n"; //줄바꿈
				bw.write(str);
//				bw.flush(); //쓸때마다 나감
			}
			bw.flush();//다 쓰고 한번에 나감
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				scan.close();
			} catch (Exception e2) {
			}
			
		}
		
		
		
		
		
		
		
	}
	
}
