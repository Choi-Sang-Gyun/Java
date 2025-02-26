package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;


public class jdbcUpdate {

	public static void main(String[] args) {
		
		/*
		 * 업데이트도 insert와 동일하게 처리합니다
		 * 
		 * 회원번호, 이름, 주소 를 입력받아서 해당 해원의 이름과 주소를 변경해주세요
		 * 
		 * 만약 회원번호가 없으면 "회원번호가 없습니다" 를 출력하면 됩니다
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호>");
		int mno = scan.nextInt();
		String a = scan.nextLine();
		
		System.out.print("변경이름>");
		String name = scan.nextLine();
		
		System.out.print("변경주소>");
		String address = scan.nextLine();
		
		Connection conn = null; //연결객체
		PreparedStatement pstmt = null; //sql 실행객체
		ResultSet rs = null; // sql을 실행한 결과
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		
		String sql2 = "UPDATE MEMBERS SET NAME = ?, ADDRESS =? WHERE MNO =?";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setInt(3, mno);
			
			int result = pstmt.executeUpdate(); // 1 or 0 반환
			
			if(result == 1) {
				System.out.println("업데이트 처리되었습니다");
			} else {
				System.out.println("없는 회원번호입니다");
			}
			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				
//				String name2 = rs.getString("name");
//				String address2 = rs.getString("address");
//				Timestamp regdate = rs.getTimestamp("regdate");
//				
//				System.out.println("수정되었습니다");
//				System.out.println(mno + ", " + name2 + ", " + address2 + ", " + regdate);
//				
//				
//				pstmt2 = conn.prepareStatement(sql2);
//				pstmt2.setString(1, name);
//				pstmt2.setString(2, address);
//				pstmt2.setInt(3, mno);
//				
//				String name2 = rs.getString("name");
//				String address2 = rs.getString("address");
//				Timestamp regdate = rs.getTimestamp("regdate");
//				System.out.println(mno + ", " + name2 + ", " + address2 + ", " + regdate);
//				
//			} else {
//				System.out.println("회원번호가 없습니다");
//			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}
	
}
