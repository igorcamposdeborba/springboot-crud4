package com.igor.firstapi.controller.exceptions;

public class StandardError {
	
	private Integer status; // status http
	private Long timestamp; // quando houve o erro
	private String message;
	
	public StandardError() {
		super();
	}
	
	public StandardError(Integer status, Long timestamp, String message) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.message = message;
	}
	
	public Integer getStatus() {
		return status;
	}
	public Long getTimeStamp() {
		return timestamp;
	}
	public String getMessage() {
		return message;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
