package api.io.steam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {
		
		//1바이트 단위로 파일 읽고 쓰고
		InputStream fis = null;
		OutputStream fos = null;
		
		String inputPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\cop.png";
		String outputPath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\hello.png";
		
		try {
			fis = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			
			//100바이트 단위로 읽은
			byte[] arr = new byte[100];
			
			int result1;
			//읽은 길이 반환, 더이상 읽을 데이터가 없으면 -1 반환
			while( (result1 = fis.read(arr)) != -1 ) {
				
//				System.out.println(Arrays.toString(arr));
				fos.write(arr, 0, result1); //데이터, 시작위치, 쓸 위치
				
			}
			
			System.out.println("파일 복사 성공!!!");
			
			
			
//			int result = fis.read(arr); //읽은 길이 반환, 더이상 읽을 데이터가 없으면 -1 반환
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
	
}
