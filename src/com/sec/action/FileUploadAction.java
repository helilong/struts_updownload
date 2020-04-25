package com.sec.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private File file;//提交的文件
	private String fileFileName;//提交的file的名字
	private String fileContentType;//提交的file的类型
	
	@Override
	public String execute() throws Exception {
		//文件的输入流
		InputStream is= new FileInputStream(file);
		//设置文件保存的目录
		String uploadPath=ServletActionContext.getServletContext().getRealPath("/upload");
		//设置目标文件
		File tofile=new File(uploadPath,this.getFileFileName());
		//文件输出流
		OutputStream os = new FileOutputStream(tofile);
		byte[] buffer= new byte[1024];
		int length=0;
		//读取file文件输出到tofile 文件中
		while(-1!=(length=is.read(buffer,0,buffer.length))){
			os.write(buffer);
		}
		//关闭输入流和输出流
		is.close();
		os.close();
		return SUCCESS;
	}
	
	
	

	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
}
