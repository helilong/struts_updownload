package com.sec.action;
import java.util.Locale;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LanguageAction extends ActionSupport {
	private String lan;//语言
	private String loc;//国家
	public String getLan() {
		return lan;
	}
	public void setLan(String lan) {
		this.lan = lan;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	//切换语言的方法
	public String changeLan(){
		//创建语言环境对象
		Locale l=new Locale(lan, loc);
		ServletActionContext.getRequest().getSession().setAttribute("WW_TRANS_I18N_LOCALE", l);
		//启用
		ActionContext.getContext().setLocale(l);
		return "login";
	}
}
