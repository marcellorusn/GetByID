package ro.emanuel.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static Connection con;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		if (con == null || con.isClosed()) {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java2025", "root", "");

		}

		return con;
	}

	public static void closeConnection() throws SQLException {
		if (con.isClosed() == false) {
			con.close();
		}
	}

}