package com.sec.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private String name;
    private String pwd;
    private int age;
    private Date birthday;
    @Override
    public String execute() throws Exception {
        System.out.println("execute");
        return SUCCESS;
    }
    public String register(){
        System.out.println("register");
        return SUCCESS;
    }
    public void validateRegister(){
        System.out.println("validate age");
        if(age>100||age<1){
            this.addActionError("年龄不合法");
        }
        if(name.equals("")){
        	
        	this.addFieldError(name,"用户名不能为空");
        }
    }
    
    
    
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println("validate");
	}

}
