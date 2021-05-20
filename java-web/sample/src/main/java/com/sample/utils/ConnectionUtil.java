package com.sample.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String DRIVER_CLASS_NAME = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "hr";
	private static final String USER_PASSWORD = "zxcv1234";
	
	/*
	 * ����Ŭ JDBC ����̹�Ŭ������ �޸𸮷� �ε��Ѵ�.
	 */
	static {
		try {
			Class.forName(DRIVER_CLASS_NAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * �����ͺ��̽��� ����� Connection�� ��ȯ�Ѵ�.
	 * @return Ŀ�ؼ� ��ü
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
	}
}
