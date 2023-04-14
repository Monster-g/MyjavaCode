package com.qf.day19;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Hashtable;

public class Demo6 {
	public static void main(String[] args) throws LoginException {
		login("aaa", "bbb");
	}
	
	public static void login(String username, String password) throws LoginException {
		if(username.equals("zhangsan") && password.equals("666666")) {
			System.out.println("µÇÂ¼³É¹¦");
		}else {
			throw new LoginException("10001");
		}
	}
}
