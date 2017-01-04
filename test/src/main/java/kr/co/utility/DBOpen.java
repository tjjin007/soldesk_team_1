package kr.co.utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Component;

@Component
public class DBOpen {
	public DBOpen() {
		System.out.println("---DBOpen ��ü ������");
	}

	public Connection getConnection() {
		// My-SQL DB
		//String url = "jdbc:mysql://127.0.0.1:3306/mydb";
		//String user = "root";
		//String password = "1234";
		//String driver = "org.gjt.mm.mysql.Driver";
		
		//ORACLE
		String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String user = "java1230";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("DB ���� ����: " + e);
		}

		return con;
	}
}
