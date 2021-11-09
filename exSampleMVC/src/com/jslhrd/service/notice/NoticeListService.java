package com.jslhrd.service.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.domain.notice.NoticeDAO;
import com.jslhrd.domain.notice.NoticeVO;
import com.jslhrd.service.Action;
import com.jslhrd.util.PageIndex;

public class NoticeListService implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeDAO dao = NoticeDAO.getInstance();
		String s_query="", query="", key="", addtag="";
		
		int totcount = 0;//총 게시글 수 카운트
		//검색키가 있는 가의 유무
		if(request.getParameter("key") != null) {
			key=request.getParameter("key");//검색어
			query=request.getParameter("search");//제목, 내용, 이름
			s_query = query + " like '%" + key + "%'";
			totcount = dao.noticeCount(s_query);
		}else {
			totcount = dao.noticeCount();
		}
		
		int nowpage=1;//현재페이지
		int maxlist=10;//페이지당 글수
		int totpage=1;//총 페이지
		
		//총 페이지수 계산
		if(totcount % maxlist == 0) {
			totpage = totcount / maxlist;
		}else {
			totpage = totcount / maxlist +1;
		}
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		
		//시작페이지, 끝페이지
		int startpage = (nowpage-1)*maxlist+1;
		int endpage = nowpage * maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);//리스트페이지에 번호 출력용
		
		// 게시글 불러오기
		List<NoticeVO> list = null;
		if(key.equals("")) {
			list = dao.noticeList(startpage, endpage);
		}else {
			list = dao.noticeList(s_query, startpage, endpage);
		}
				
		// 페이지 번호 생성
		String pageSkip="";
		if(key.equals("")) {
			pageSkip=PageIndex.pageList(nowpage, totpage, "/Guest?cmd=guest_list", addtag);
		}else {
			pageSkip=PageIndex.pageListHan(nowpage, totpage, "/Guest?cmd=guest_list", query, key);			
		}
		
		request.setAttribute("totcount", totcount);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", nowpage);//현재페이지
		request.setAttribute("totpage", totpage);//총페이지
		request.setAttribute("list", list);
		request.setAttribute("query", query);
		request.setAttribute("key", key);
		request.setAttribute("pageSkip", pageSkip);

		
		RequestDispatcher rd = request.getRequestDispatcher("/Notice/notice_list.jsp");
		rd.forward(request, response);
	}

}
