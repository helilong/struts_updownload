package com.sec.action;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.apache.struts2.ServletActionContext;
import sun.misc.BASE64Encoder;
import com.opensymphony.xwork2.ActionSupport;

public class FileDownLoadAction extends ActionSupport {
	private String filename; // 代表下载文件的名称
	private String contentType; // 下文件的 MimeType

	/**
	 * 获取文件的名称
	 */
	public String getFilename() throws IOException {
		// 对不同浏览器传过来的文件名进行编码
		return encodeDownloadFilename(filename, ServletActionContext.getRequest().getHeader("User-Agent"));
	}

	public void setFilename(String filename) throws UnsupportedEncodingException {
		// 对文件名称编码
		filename = new String(filename.getBytes("iso-8859-1"), "utf-8");
		this.filename = filename;
	}

	/**
	 * 获取文件的类型
	 */
	public String getContentType() {
		return ServletActionContext.getServletContext().getMimeType(filename);
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	// 定义了返回InputStream的方法，该方法作为被下载文件的入口
	public InputStream getFileDownload() {
		// 要下载的文件的路径
		String filepath = "/upload/" + filename;
		return ServletActionContext.getServletContext().getResourceAsStream(filepath);
	}

	/*
	 * 对不同浏览器传过來的文件名称进行转码
	 * 
	 * @param name文件名窗；
	 * 
	 * @param agenr浏览器
	 * 
	 * @return转码后的名称
	 */

	public String encodeDownloadFilename(String name, String agent) throws IOException {
		if (agent.contains("Firefox")) { // 火孤浏览器
			name = "=?UTF-8?B?" + new BASE64Encoder().encode(name.getBytes("utf-8")) + "?=";
		} else { // IE及其他浏览器
			name = URLEncoder.encode(name, "utf-8");
		}
		return name;
	}
}