package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

import javax.sql.RowSetInternal;

public class jdbcSelect2 {

	public static void main(String[] args) {
		
		/*
		 * 회원번호를 입력받아서, 해당 회원번호에 회원정보만 출력하는 jdbc 프로그램을 작성
		 * 회원번호가 없으면 "회원번호는 없습니다"로 출력합니다
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.err.print("회원번호>");
		int mno = scan.nextInt();
		
		
		
		//모든 회원 정보를 번호순으로 내림차순 해서 조회
		Connection conn = null; //연결객체
		PreparedStatement pstmt = null; //sql을 실행하기 위한 객체
		ResultSet rs = null; // sql을 실행한 결과를 반환 받을 객체
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//"jdbc:oracle:thin:@아이피주소:포트번호:데이터베이스명"
		String uid = "HR";
		String upw = "HR";
		
		String sql = "SELECT * FROM MEMBERS WHERE MNO = ?";
		
		
		try {
			//1. 드라이버 클래스 준비
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.conn
			conn = DriverManager.getConnection(url, uid, upw);
			
			//3.pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mno); //정수로 받은 값이라서
			
			
			//4. 실행
			rs = pstmt.executeQuery(); //pk기준 조회 -> 1행
			
			if(rs.next()) {
				
				String name = rs.getString("name");
				String address = rs.getString("address");
				Timestamp regdate = rs.getTimestamp("regdate");
				System.out.println(mno + ", " + name + ", " + address + ", " + regdate);
				
			} else {
				System.out.println("회원번호:" + mno + "는 없습니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
				scan.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
	
}
