package com.raveerasoft.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="message", eager=true)
@RequestScoped
public class Message {
	private String message = "New Message";
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
	      this.message = message;
	}

}
