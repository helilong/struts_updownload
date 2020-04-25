package com.sec.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String loginName;
	private String loginPwd;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	//µÇÂ¼·ÃÎÊ·½·¨
	public String login(){
		if("admin".equals(loginName) && "123456".equals(loginPwd)){
			return "ok";
		}
		return "login";
	}
}
