package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcInsert {

	public static void main(String[] args) {
		
		
		//이름, 주소를 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("이름>");
		String name = scan.nextLine();
		System.out.print("주소>");
		String address = scan.nextLine();
		
		Connection conn = null; //연결객체
		PreparedStatement pstmt = null; //sql을 실행하기 위한 객체
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//"jdbc:oracle:thin:@아이피주소:포트번호:데이터베이스명"
		String uid = "HR";
		String upw = "HR";
		
		String sql = "INSERT INTO MEMBERS(MNO, NAME, ADDRESS) VALUES(MEMBERS_SEQ.NEXTVAL, ? , ?)";
		
		try {
			//자바 sql패키지는 SQLException 예외를 던지고 있어서, try~catch 문 안에서 실행함
			//1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 커넥션 생성
			conn = DriverManager.getConnection(/*디비의 주소*/url, /*유저명*/uid, /*비밀번호*/upw );
			//3.stmt 객체 생성
			pstmt = conn.prepareStatement(sql); // 호출 시킨 후 저장까지 해줘야한다
			//4. ? 값을 채운다 - ?는 순서대로 1번을 가집니다 
			//채울값이 문자열이면 setString(), 실수면 setDouble(), 정수면 setInt() 등으로 채운다
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			//5.실행
			//select구문은 executeQurey()
			//insert, update, delete 구문은 executeUpdate()
			
			int result = pstmt.executeUpdate();//반환이 정수
			
			if(result == 1) {// 1이면 성공
				System.out.println("정상 입력 되었습니다");
			} else {// 0이면 실패
				System.out.println("입력 실패입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
				
				
				
	}
	
	
}
