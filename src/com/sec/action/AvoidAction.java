package com.sec.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class AvoidAction extends ActionSupport {
private static final long serialVersionUID = 2676453800249807631L;
    
    private String username;
    private Date birthday;
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /**
     * ��������߼�����Ϊ����4���ӣ��������л����ε���ύ��ť������Ч����
     */
    @Override
    public String execute()
    {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return SUCCESS;
    }

}
