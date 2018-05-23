package com.wuxi.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private static String jdbcDriverClass = null;
	private static String url = null;
	private static String user = null;
	private static String pwd = null;
	
	static {
		try {
			InputStream is = ConnectionManager.class.getClassLoader().getResourceAsStream("config/db.properties");
			Properties properties = new Properties();
			properties.load(is);
			jdbcDriverClass = properties.getProperty("DriverClass");
			Class.forName(jdbcDriverClass);
			url = properties.getProperty("URL");
			user = properties.getProperty("USER");
			pwd = properties.getProperty("PASSWORD");
			is.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//用数据库连接池来提高效率
	public static Connection getConnection() {
		try {
			Connection conn = DriverManager.getConnection(url, user, pwd);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
