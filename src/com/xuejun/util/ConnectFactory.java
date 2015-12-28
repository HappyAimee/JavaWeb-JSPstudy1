package com.xuejun.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectFactory {
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectFactory factory = new ConnectFactory();
	private static Connection conn;

	static {
		Properties prop = new Properties();
		try {
			InputStream in1 = ConnectFactory.class.getClassLoader().getResourceAsStream("jdbconfig.properties");
			prop.load(in1);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("========配置文件读取错误===========");
		}
		driver = prop.getProperty("driver");
	    System.out.println(driver);
		dburl = prop.getProperty("dburl");
		System.out.println(dburl);
		user = prop.getProperty("user");
		password = prop.getProperty("password");

	}

	private ConnectFactory() {

	}

	public static ConnectFactory getInstance() {
		return factory;
	}

	public Connection makeConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
