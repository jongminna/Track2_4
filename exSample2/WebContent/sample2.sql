-- 관리자 테이블
-- 테이블 구조 `tbl_admin`
CREATE TABLE tbl_admin (
  a_name varchar2(20) NOT NULL ,	--  이름
  a_userid varchar2(20) NOT NULL ,	--  아이디
  a_passwd varchar2(100) NOT NULL ,	--  비밀번호
  a_dept varchar2(20) NOT NULL ,	--  소속부서
  a_phone varchar2(20) NOT NULL ,	--  연락처
  a_rate number(2) default NULL,	--  권한 순위
  a_firsttime date default sysdate,	--  등록일자
  a_lasttime date,			--  최근 접록일
  PRIMARY KEY(a_userid)
);

-- 공지사항 테이블
-- 테이블 구조 'tbl_notice`
CREATE TABLE tbl_notice (
  n_idx number NOT NULL ,			--  고유번호, 자동증가
  n_subject varchar2(255) NOT NULL ,		--  제목
  n_contents varchar2(2000) NOT NULL,		--  내용
  n_readcnt number default 0,			--  조회수
  n_regdate date default sysdate,		--  등록일자
  n_update date default null,			--  최종수정일자
  a_userid varchar2(20) references tbl_admin ,	--  관리자 아이디
  PRIMARY KEY(n_idx)
);
create sequence tbl_notice_seq_n_idx;

-- 간편 회원정보 테이블
-- 테이블 구조 `tbl_user`
create table tbl_user(
   u_name varchar2(20) not null,		-- 회원이름
   u_id varchar2(20) not null,			-- 회원 ID
   u_pw varchar2(100) not null,			-- 비밀번호
   u_tel varchar2(14) not null,			-- 전화(지역/핸드폰)
   u_mail varchar2(100),			-- 이메일
   u_firsttime date default sysdate,		-- 가입날짜
   u_lasttime date,				-- 마지막 로그인날짜
   PRIMARY KEY(u_id)
);

-- 포토 갤러시 테이블
-- 테이블 구조 'tbl_gallery`
CREATE TABLE tbl_gallery (
  g_idx number NOT NULL ,			--  고유번호
  g_gubun varchar2(10) NOT NULL ,		--  겔러리구분
  g_userid varchar2(20) NOT NULL ,		--  겔러리등록자아이디
  g_subject varchar2(100) NOT NULL ,		--  제목
  g_contents varchar2(2000),			--  내용
  g_photo varchar2(255) NOT NULL ,		--  사진
  g_readcnt number default 0,			--  조회수
  g_regdate date default sysdate,		--  등록일자
  g_update date,				--  최종수정일자
  PRIMARY KEY(g_idx)
);
create sequence tbl_gallery_seq_g_idx;

-- 질문 정보 테이블 테이블
-- 테이블 구조 `tbl_question`

CREATE TABLE tbl_question (
  q_idx number NOT NULL,			-- 기본키
  q_gubun varchar2(10) NOT NULL,		-- 질문구분
  q_name varchar2(20) NOT NULL,			-- 작성자
  q_subject varchar2(150) NOT NULL,		-- 제목
  q_contents varchar2(2000) NOT NULL,		-- 내용
  q_regdate date default sysdate,		-- 등록일자
  q_answer char(1) default '0',			-- 답변유무(0/1)
  PRIMARY KEY(q_idx)
);
create sequence tbl_question_seq_q_idx;

--
-- 답변정보 테이블
-- 테이블 구조 `tbl_answer`

CREATE TABLE tbl_answer (
  q_idx number references tbl_question,	-- 메인글 키번호
  an_name varchar(12) NOT NULL,			-- 답변글 작성자
  an_contents varchar2(2000) not null,		-- 답글정보
  an_regdate date default sysdate		-- 등록일자
);

