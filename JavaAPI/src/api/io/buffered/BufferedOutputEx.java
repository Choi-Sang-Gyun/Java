package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputEx {

	public static void main(String[] args) {
		
		/*
		 * buffered 가 붙은 클래스는 입출력 성능향상을 위한 스트림 클래스
		 * 
		 * buffered + 스트림타입으로 이름이 결정됩니다
		 * 
		 * bufferedOutputStream
		 * 1바이트 출력(outputstream)인데, 성능향상 스트림
		 * 
		 *
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text01.txt";
		
//		OutputStream os = null;
		BufferedOutputStream bos = null;
		
		try {
			// os = new FileOutputStream(path);
			bos = new BufferedOutputStream( new FileOutputStream(path) );
			
			String str = "Youjin choi? good morning?";
			
			bos.write(str.getBytes()); //실제 파일을 씀
			bos.flush(); // 버퍼를 밀어냄(데이터가 전달됨)
			//모은 데이터를 전송하는(밀어내는) 것
			
			
//			Thread.sleep(20000); // 20초 스탑
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (Exception e2) {
			}
		}
		
		System.out.println("프로그램 정상종료");
		//프로그램이 종료되면 버퍼가 자동으로 비워짐
		//근데 나중에 만드는 프로그램은 종료되지 않음
		//그래서 해야 하는게 flush();
		
		
	}
	
}
