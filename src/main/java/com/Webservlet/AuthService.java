package com.Webservlet;

public class AuthService {
	
	private String user="username";
	
	private String password="password";
	
	public boolean secure(String u, String p) {
		if(u.equals(user) && p.equals(password)) {
			return true;
		}
		return false;
	}

}
