package com.jslhrd.controller;

import com.jslhrd.service.Action;
import com.jslhrd.service.pds.PdsDeleteProService;
import com.jslhrd.service.pds.PdsDeleteService;
import com.jslhrd.service.pds.PdsListService;
import com.jslhrd.service.pds.PdsModifyProService;
import com.jslhrd.service.pds.PdsModifyService;
import com.jslhrd.service.pds.PdsViewService;
import com.jslhrd.service.pds.PdsWriteProService;
import com.jslhrd.service.pds.PdsWriteService;

public class PdsActionFactory {
	private PdsActionFactory() {}
	
	private static PdsActionFactory instance = 
							new PdsActionFactory();
	
	public static PdsActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
		
		if(cmd.equals("pds_list")) {
			action = new PdsListService();
		}else if(cmd.equals("pds_write")) { //등록 폼
			action = new PdsWriteService();
		}else if(cmd.equals("pds_write_pro")) { //등록처리
			action = new PdsWriteProService();
		}else if(cmd.equals("pds_view")) {
			action = new PdsViewService();
		}else if(cmd.equals("pds_modify")) {//수정 폼
			action = new PdsModifyService();
		}else if(cmd.equals("pds_modify_pro")) {//수정처리
			action = new PdsModifyProService();
		}else if(cmd.equals("pds_delete")) {//삭제폼(비번입력)
			action = new PdsDeleteService();
		}else if(cmd.equals("pds_delete_pro")) {//삭제처리
			action = new PdsDeleteProService();
		}
		return action;
	}
	
}
