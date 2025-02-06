package quiz21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;



public class FileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * youjin choi가 입사한 회사에서는 매일 오전 7시에 연계사에서 
		 * 날짜유형의 csv파일을 전송을 해줍니다.
		 * 
		 * ex) 2025_01_24_data.csv 유형의 파일입니다
		 *
		 * 그래서 youjin choi는 *매일 아침*마다 csv파일을 읽어서 데이터베이스에 저장하는
		 * 프로그램 코드를 만들어야 합니다.
		 *
		 * 데이터베이스에 저장하려면, List<Data>클래스로 값을 저장해야 합니다.
		 * Data클래스는 getter, setter를 가지는 은닉 클래스입니다.
		 * 
		 * 1. buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요. 
		 * 2. 읽은 데이터를 ,기준으로 분리해서 데이터를 리스트에 잘 정리해서 저장해 주세요.
		 */
		
		Date date = new Date();
		//data 클래스 파일을 쓰기 위해서
		
		SimpleDateFormat time = new SimpleDateFormat("yyyy_MM_dd");
		//오늘 날짜를 얻기 위해서
		String today = time.format(date);
		//date는 객체로 현재 날짜와 시간을 나타낸다
		//time.format(date) -> date 객체에 포함된 날짜를 yyyy_MM_dd 형태의 문자열로 변환하여 반환한다는 뜻
		//이걸로 매일 날짜가 변경되는 파일에도 대응가능하다
		
//		System.out.println(today);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\quiz21\\"+today+"_data.csv";
		//파일 지정인데, 위에서 변동되는 날짜에 대해 대응하는 주소이다
		
		BufferedReader br = null;
		LinkedList<Data> list = new LinkedList<>();
		//Data 클래스를 사용하기 위해서 Data라는 객체만 저장할 수 있게 함
		//리스트로 여기다 data를 저장할 예정
		//저장하는 data의 양식은 이름(String), 나이(String), 이메일(String), 주소(String)의 형태이다
		
		try {
		//Buffer는 오류를 던지고 있는게 기본이라 try안에서 써야함
			br = new BufferedReader(new FileReader(path) );
			//FileReader는 파일을 문자단위로 읽기 위한 클래스다
			//이 클래스는 파일경로(path)를 입력 받고, 그 파일에서 문자를 하나씩 읽을 수 있게 해줌
			//bufferedReader 자체는 파일을 직접 읽는 기능 제공x, 문자를 읽는 기능인 filereader와 함께 사용
			
			String str = br.readLine();
			//첫 줄을 넘기기 위해
			//한줄씩 읽는다
			
			while(true) { //읽어오는 폴더를 	
				if((str = br.readLine()) != null) {
					//읽어오는 폴더의 내용이 있다면
					System.out.println(str);
					//한줄 자른걸 보여주고
					
					String[] arr = str.split(",");
					//배열 arr 에다가 자른 한줄을 , 기준으로 잘라서 넣음
					//그게 split이라는 메서드
					
					Data data = new Data(arr[0],arr[1],arr[2],arr[3]);
					//새로운 data를 만들어서 list(data를 저장하는 곳)에다가 저장
					//list가 data를 저장한다고 만들었기 때문에
					//LinkedList<Data> list = new LinkedList<>();
					//<Data>라고 표시 되어 있음
					//data의 형태를 취해야 함
					
					list.add(data);
					//list에 추가
					
				} else {
					//읽어올 내용이 없다는 뜻
					break;
					//반복 종료
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			//오류 발생시 보여줌
		} finally {
			try {
				br.close();
				//읽어오는 기능 종료
			} catch (Exception e2) {
				
			}
		}
		
		for (Data data : list) {
			System.out.println("이름: " + data.getName() + ", 나이: " + data.getAge() + ", 이메일: " + data.getEmail() + ", 주소: " + data.getAddress());
		}
		//list에 저장한 내용을 확인하기 위한 for문
		
		
		
		
	}
	
}
