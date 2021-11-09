package exServlet.model.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import exServlet.util.DBManager;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	//회원전체정보 검색;
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

	// 아이디 중복 검사
	public int memberIDcheck(String userid){

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

	//우편번호 검색
	public List<ZipVO> zipList(String addr) {

		String query="select *  from zipcode where dong like '%" +addr +"%'";
		List<ZipVO> list = new ArrayList<ZipVO>();//리턴타입
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			ZipVO vo=null;
			while(rs.next()) {
				vo = new ZipVO();
				vo.setNo(rs.getInt("no"));
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
	
	//회원가입
	public int memberWrite(MemberVO vo){
		
		String query="insert into tbl_member(name,userid,passwd,"
				+ "gubun,zip,addr1,addr2,tel,email,job,intro,"
				+ "favorite) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		int row=0;//리턴타입
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
			pstmt.setString(10, vo.getJob());
			pstmt.setString(11, vo.getIntro());
			pstmt.setString(12, vo.getFavorite());
			row = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt,rs);
		}
		return row;
	}
	//로그인
	public int memberLogin(String userid, String passwd){
		String query="select passwd from tbl_member where userid=?";
		int row=0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String dbpass = rs.getString("passwd");
				if(dbpass.equals(passwd)) {//로그인 성공
					query="update tbl_member set last_time=sysdate where userid=?";
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, userid);
					row = pstmt.executeUpdate();
				}else {//비번오류
					row=0;
				}
			}else {//아이디가 존재하지 않을 경우
				row=-1;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}
	
	//로그인 성공시 필요한 정보
	public MemberVO getMember(String userid){
		String query="select * from tbl_member where userid=?";
		MemberVO vo = new MemberVO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setNString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return vo;
	}

	//회원정보 상세(View)
	public MemberVO memberView(String userid){
		String query="select * from tbl_member where userid=?";
		MemberVO vo = new MemberVO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setNString(1, userid);
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
				vo.setJob(rs.getString("job"));
				vo.setIntro(rs.getString("intro"));
				vo.setFavorite(rs.getString("favorite"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return vo;
	}
	
}
