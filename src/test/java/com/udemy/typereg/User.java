package com.udemy.typereg;

public class User {

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	private String UserId;
	private String Pwd;

	public User(String UserId, String Pwd) {
		this.UserId = UserId;
		this.Pwd = Pwd;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("UserName is %s and Password is", this.UserId,this.Pwd);
	}

}
