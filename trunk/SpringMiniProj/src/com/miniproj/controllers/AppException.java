package com.miniproj.controllers;

public class AppException extends RuntimeException{	 
	
	private static final long serialVersionUID = 1L;
	private String exceptionMsg;
 
	public AppException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	public String getExceptionMsg(){
		return this.exceptionMsg;
	}
	
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}