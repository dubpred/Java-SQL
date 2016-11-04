package test1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class main {

	public static void main(String[] args) {
		System.out.println("Testing...");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// for
																			// sqljdbc4
			System.out.println("driver found.....");
		}

		catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			String userName = "UTAD\\byoung19";
			String password = "";
			String url = "jdbc:sqlserver://SQL4250:1433;databaseName=bryce.young";
			conn = DriverManager.getConnection(url, userName, password);
		}

		catch (Exception e) {
			System.out.println(e.toString());
			return;
		}

		try {

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		finally {
			
		}

	}
}
