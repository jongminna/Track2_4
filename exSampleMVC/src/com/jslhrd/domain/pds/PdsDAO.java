package com.jslhrd.domain.pds;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jslhrd.util.DBManager;

public class PdsDAO {
	private PdsDAO() {}
	private static PdsDAO instance = new PdsDAO();
	public static PdsDAO getInstance() {
		return instance;
	}

	public int pdsWrite(PdsVO pVo) {
		String sql = "insert into tbl_pds(idx,name,email,subject,contents,pass,filename) " +
				" values(tbl_pds_seq_idx.nextval, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row=0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pVo.getName());
			pstmt.setString(2, pVo.getEmail());
			pstmt.setString(3, pVo.getPass());
			pstmt.setString(4, pVo.getSubject());
			pstmt.setString(5, pVo.getContents());
			pstmt.setString(6, pVo.getFilename());
			row=pstmt.executeUpdate(); // 실행
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

}
