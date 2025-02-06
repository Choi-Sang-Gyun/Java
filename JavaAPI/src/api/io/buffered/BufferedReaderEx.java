package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * 2바이트 기반의 성능향상 보조 스트림
		 * readLine() - 한줄씩 통째로 읽어들입니다
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text02.txt";
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));
			
//			System.out.println(br.readLine()); // 한줄씩 읽음
//			System.out.println(br.readLine()); // 더 이상 읽을 게 없으면 null이 나온다
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
	
}
