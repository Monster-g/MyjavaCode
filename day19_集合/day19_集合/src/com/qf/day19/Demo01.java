package com.qf.day19;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo01 {
	public static Properties properties = new Properties();
	
	static {
		InputStream inputStream = Demo01.class.getResourceAsStream("/jdbc.properties");
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(properties);
		System.out.println(properties.getProperty("jdbc.username"));
		System.out.println(properties.getProperty("jdbc.password"));
		System.out.println(properties.getProperty("jdbc.driver"));
		System.out.println(properties.getProperty("jdbc.url"));
	}
}
