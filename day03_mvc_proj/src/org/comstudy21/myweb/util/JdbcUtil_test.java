package org.comstudy21.myweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil_test {
	public static Connection getConnection() {
		String url = " jdbc:h2:tcp://localhost/~/test".trim();
		String user = "sa";
		String password = "12345";
		Connection conn = null;
		// 드라이버
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패!");
			e.printStackTrace();
		}
		return conn;
	}
}
