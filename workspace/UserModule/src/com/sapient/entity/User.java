package com.sapient.entity;

public class User {

	String email;
	String pwd;
	String confirmPwd;
	
	
	
	@Override
	public String toString() {
		return "User [email=" + email + ", pwd=" + pwd + ", confirmPwd="
				+ confirmPwd + "]";
	}
	public User(String email, String pwd, String confirmPwd) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
	}
	public String getConfirmPwd() {
		return confirmPwd;
	}
	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
