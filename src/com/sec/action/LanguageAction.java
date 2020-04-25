package com.sec.action;
import java.util.Locale;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LanguageAction extends ActionSupport {
	private String lan;//����
	private String loc;//����
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
	
	//�л����Եķ���
	public String changeLan(){
		//�������Ի�������
		Locale l=new Locale(lan, loc);
		ServletActionContext.getRequest().getSession().setAttribute("WW_TRANS_I18N_LOCALE", l);
		//����
		ActionContext.getContext().setLocale(l);
		return "login";
	}
}
