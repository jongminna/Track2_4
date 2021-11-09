package WebExam.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DBManager {
/*
 * 커넥션 풀 미사용시
	public static Connection getConnection(){
		Connection myConn = null;
		//DB 연결정보
		String myDriver="oracle.jdbc.driver.OracleDriver";
		String myURL="jdbc:oracle:thin:@localhost:1521:xe";
		String myID="track2_4";
		String myPass="1234";
		
		try {
			Class.forName(myDriver);
			//System.out.println("드라이버 로딩");
		}catch(Exception e) {}
		
		try {
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			//System.out.println("커넥션 연결");
		}catch(Exception e) {}
		
		return myConn;
	}
*/
	//커넥션 풀 이용시
	public static Connection getConnection(){
		Connection myConn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			
			myConn = ds.getConnection();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return myConn;
	}
	// select을 수행한 후 리소스 해제를 위한 메소드
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// insert, update, delete 작업을 수행한 후 리소스 해제를 위한 메소드
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
