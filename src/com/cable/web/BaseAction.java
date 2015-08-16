package com.cable.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = -6343368472418064824L;

	protected HttpServletRequest getHttpRequest () {
		return ServletActionContext.getRequest();
	}
	
	protected HttpServletResponse getHttpResponse() {
		return ServletActionContext.getResponse();
	}
	
	protected HttpSession getHttpSession() {
		return getHttpRequest().getSession();
	}
}
