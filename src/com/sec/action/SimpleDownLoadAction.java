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
	
	//定义返回inputstream 的方法 ， 该方法作为被下载的文件的入口
	
	public InputStream getDownloadFile(){
		//获取下载的文件名称
		String filename=ServletActionContext.getRequest().getParameter("filename");
		System.out.println(filename);
		//定义下载的路径   相对路径 
		String filePath="/upload/"+filename;
		//返回一个流对象
		return ServletActionContext.getServletContext().getResourceAsStream(filePath);
		
	}

}
