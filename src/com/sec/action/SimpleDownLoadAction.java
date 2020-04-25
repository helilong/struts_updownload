package com.sec.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SimpleDownLoadAction extends ActionSupport {
	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) throws UnsupportedEncodingException {
		
		filename=new String(filename.getBytes("iso-8859-1"),"utf-8");
		this.filename = filename;
	}
	
	//���巵��inputstream �ķ��� �� �÷�����Ϊ�����ص��ļ������
	
	public InputStream getDownloadFile(){
		//��ȡ���ص��ļ�����
		String filename=ServletActionContext.getRequest().getParameter("filename");
		System.out.println(filename);
		//�������ص�·��   ���·�� 
		String filePath="/upload/"+filename;
		//����һ��������
		return ServletActionContext.getServletContext().getResourceAsStream(filePath);
		
	}

}
