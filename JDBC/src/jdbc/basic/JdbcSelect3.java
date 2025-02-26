package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcSelect3 {

	public static void main(String[] args) {
		
		/*
		 * 테이블은 employees, departments
		 * 
		 * 회원번호를 입력받아서, 이 회원의 이름, 부서아이디, 부서명, 급여
		 * 를 출력하는 join문장을 작성합니다
		 * 
		 * sqldeveloper에서 먼저 sql을 연습을 하고 복붙
		 * 오류를 줄이기 위해
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호>");
		int num = scan.nextInt();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "SELECT FIRST_NAME || ' ' || LAST_NAME AS NAME, \r\n"
				+ "       E.DEPARTMENT_ID, \r\n"
				+ "       DEPARTMENT_NAME, \r\n"
				+ "       SALARY   \r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "LEFT OUTER JOIN DEPARTMENTS D \r\n"
				+ "ON E.DEPARTMENT_ID = D.DEPARTMENT_ID \r\n"
				+ "WHERE EMPLOYEE_ID = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //기본적으로 -1에서 시작하기 때문에 지정을 해줘도 1번은 앞으로 나아가야 서치가 가능하다
				
				String name = rs.getString("name");
				int department_id = rs.getInt("department_id");
				String department_name = rs.getString("department_name");
				int salary = rs.getInt("salary");
				
				System.out.println(name + ", " + department_id + ", " + department_name + ", " + salary);
				
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
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
	
}
