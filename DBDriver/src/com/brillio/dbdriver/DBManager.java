package com.brillio.dbdriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBManager {

	String dbname;
	String user;
	String password;
	Connection con;
	Statement stmt;

	public DBManager(String dbname, String user, String password) {

		this.dbname = dbname;
		this.user = user;
		this.password = password;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.dbname, "root", "root");
			stmt = con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public ArrayList<String> getAll(String tableName) throws SQLException, ClassNotFoundException {

		System.out.println("Connection established ...");

		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from " + tableName);
		ArrayList<String> list = new ArrayList<String>();
		while (rs.next()) {

			ResultSetMetaData rsm = rs.getMetaData();
			int count = rsm.getColumnCount();
			String str = "";
			for (int i = 1; i <= count; i++) {
				str = str + "           " + rs.getString(i);
			}
			list.add(str);
		}
//		System.out.println(list);
		rs.close();
		stmt.close();
		return list;

	}

	public void insert(String tableName, HashMap<String, String> data) throws SQLException {

		System.out.println("Inserting records ...");
		String columnkey = "";
		String columnvalues = "";
		stmt = con.createStatement();

		for (HashMap.Entry<String, String> elements : data.entrySet()) {

			String keys = elements.getKey();
			columnkey = columnkey + keys + ",";

			String values = elements.getValue();

			if (values.charAt(0) >= 48 && values.charAt(0) <= 57)
				columnvalues = columnvalues + values + ",";
			else
				columnvalues = columnvalues + "'" + values + "',";
		}
		columnkey = columnkey.substring(0, columnkey.length() - 1);
		System.out.println(columnkey);

		columnvalues = columnvalues.substring(0, columnvalues.length() - 1);
		System.out.println(columnvalues);

		String query = "INSERT INTO " + tableName + "(" + columnkey + ")" + " VALUES (" + columnvalues + ")";
		System.out.println(query);
		stmt.executeUpdate(query);
		stmt.close();

	}

}
