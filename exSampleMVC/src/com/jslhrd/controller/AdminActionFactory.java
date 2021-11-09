package com.jslhrd.controller;

import com.jslhrd.service.Action;
import com.jslhrd.service.admin.AdminLoginProService;
import com.jslhrd.service.admin.AdminLoginService;
import com.jslhrd.service.admin.AdminNoticeListService;

public class AdminActionFactory {
	private AdminActionFactory() {}
	
	private static AdminActionFactory instance = 
							new AdminActionFactory();
	
	public static AdminActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String cmd) {
		Action action = null;
		
		if(cmd==null) {
			action=new AdminLoginService();
		}else if(cmd.equals("login_ok")) {
			action=new AdminLoginProService();
		}else if(cmd.equals("notice_list")) {
			action=new AdminNoticeListService();
		}
		
		return action;
	}
	
}
