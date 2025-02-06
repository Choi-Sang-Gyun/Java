package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 빠른입출력 {

	public static void main(String[] args) {
		
		System.out.println(); //출력
		Scanner scan = new Scanner(System.in); //입력
		//얘네는 편의 기능
		
		/*
		 * 빠른 입출력에서는 
		 * InputStreamReader
		 * OutputStreamWriter 클래스를 사용합니다
		 * 
		 */
//		우리가 스캔때 쓰는
//		System.in //인풋 스트림 타입의 객체 //키보드로부터의 입력
//		System.out //
		
//		new InputStreamReader(System.in); //부모가 reader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)/*reader 클래스*/);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out/*writer 클래스*/));
		
		try {
			System.out.println(">");
			String input = br.readLine();
			System.out.println(input);
			
			//////////////////////////
			//입력받은 내용을 출력함
			bw.write(input);
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();		
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}
	
}
