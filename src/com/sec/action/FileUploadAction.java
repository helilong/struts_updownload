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
	private File file;//�ύ���ļ�
	private String fileFileName;//�ύ��file������
	private String fileContentType;//�ύ��file������
	
	@Override
	public String execute() throws Exception {
		//�ļ���������
		InputStream is= new FileInputStream(file);
		//�����ļ������Ŀ¼
		String uploadPath=ServletActionContext.getServletContext().getRealPath("/upload");
		//����Ŀ���ļ�
		File tofile=new File(uploadPath,this.getFileFileName());
		//�ļ������
		OutputStream os = new FileOutputStream(tofile);
		byte[] buffer= new byte[1024];
		int length=0;
		//��ȡfile�ļ������tofile �ļ���
		while(-1!=(length=is.read(buffer,0,buffer.length))){
			os.write(buffer);
		}
		//�ر��������������
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
