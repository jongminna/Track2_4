package com.jslhrd.controller;

import com.jslhrd.service.Action;
import com.jslhrd.service.board.BoardDeleteProService;
import com.jslhrd.service.board.BoardDeleteService;
import com.jslhrd.service.board.BoardListService;
import com.jslhrd.service.board.BoardModifyProService;
import com.jslhrd.service.board.BoardModifyService;
import com.jslhrd.service.board.BoardViewService;
import com.jslhrd.service.board.BoardWriteProService;
import com.jslhrd.service.board.BoardWriteService;

public class BoardActionFactory {
	private BoardActionFactory() {}
	
	private static BoardActionFactory instance = 
							new BoardActionFactory();
	
	public static BoardActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
		
		if(cmd.equals("board_list")) {
			action = new BoardListService();
		}else if(cmd.equals("board_write")) { //등록 폼
			action = new BoardWriteService();
		}else if(cmd.equals("board_write_pro")) { //등록처리
			action = new BoardWriteProService();
		}else if(cmd.equals("board_view")) {
			action = new BoardViewService();
		}else if(cmd.equals("board_modify")) {//수정 폼
			action = new BoardModifyService();
		}else if(cmd.equals("board_modify_pro")) {//수정처리
			action = new BoardModifyProService();
		}else if(cmd.equals("board_delete")) {//삭제폼(비번입력)
			action = new BoardDeleteService();
		}else if(cmd.equals("board_delete_pro")) {//삭제처리
			action = new BoardDeleteProService();
		}
		return action;
	}
	
}
