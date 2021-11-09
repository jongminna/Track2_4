package exModel.model.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exModel.util.DBManager;

public class MemberDAO {
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
    
	public static MemberDAO getInstance() {
		return instance;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	//ID 중복 검사 메소드
	public int memberIDcheck(String userid) throws Exception {

		String query="select count(*) as counter  from tbl_member where userid=?";
		int row=0;//리턴타입
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				row = rs.getInt(1); //row = rs.getInt("counter");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt,rs);
		}
		return row;
	}
	// 우편번호 검색 메소드
	public List<ZipVO> zipList(String addr) throws Exception {

		String query="select *  from zipcode where dong like '%" +addr +"%'";
		//String query2="select *  from zipcode where dong like ?";
		List<ZipVO> list = new ArrayList<ZipVO>();//리턴타입
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			//pstmt = conn.prepareStatement(query2);
			//pstmt.setString(1, "%"+addr+"%");

			rs = pstmt.executeQuery();
			ZipVO vo=null;
			while(rs.next()) {
				vo = new ZipVO();
				vo.setNo(rs.getString("no"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setSido(rs.getString("sido"));
				vo.setGugun(rs.getString("gugun"));
				vo.setDong(rs.getString("dong"));
				vo.setBunji(rs.getString("bunji"));
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt,rs);
		}
		return list;
	}
	
	//회원등록 메소드
	public int memberWrite(MemberVO vo) {
		String query="insert into tbl_member(name,userid,passwd,gubun,zip,addr1,addr2,tel,email,favorite,job,intro) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		int row=0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getUserid());
			pstmt.setString(3, vo.getPasswd());
			pstmt.setString(4, vo.getGubun());
			pstmt.setString(5, vo.getZip());
			pstmt.setString(6, vo.getAddr1());
			pstmt.setString(7, vo.getAddr2());
			pstmt.setString(8, vo.getTel());
			pstmt.setString(9, vo.getEmail());
			pstmt.setString(10, vo.getFavorite());
			pstmt.setString(11, vo.getJob());
			pstmt.setString(12, vo.getIntro());
			
			row = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	//회원전체목록
	public List<MemberVO> memberList(){
		String query="select * from tbl_member order by first_time desc";
		List<MemberVO> list = new ArrayList();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setLast_time(rs.getString("last_time"));
				
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	//특정회원 상세정보조회
	public MemberVO memberSelect(String userid) {
		String query="select * from tbl_member where userid=?";
		MemberVO vo = new MemberVO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setGubun(rs.getString("gubun"));
				vo.setZip(rs.getString("zip"));
				vo.setAddr1(rs.getString("addr1"));
				vo.setAddr2(rs.getString("addr2"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setFavorite(rs.getString("favorite"));
				vo.setJob(rs.getString("job"));
				vo.setIntro(rs.getString("intro"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return vo;
	}
}
