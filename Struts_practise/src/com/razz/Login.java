package com.razz;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{



	public Login() {
		// TODO Auto-generated constructor stub
	}
	private Bean bean;
	
	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	public String execute() throws Exception
	{
		if(bean.getUserName().equals("123")&& bean.getPassword().equals("abc"))
		{
			return SUCCESS;	
		}
		return ERROR;
		
	}
	
}
