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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DBManager {

	String dbname;
	Connection con;
	Statement stmt;

	public DBManager(String dbname) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+this.dbname, "root", "root");
			stmt = con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public List<String> getAll(String tableName) throws SQLException {
		String query = "select * from " + tableName;
		ResultSet rs = stmt.executeQuery(query);
		List<String> list = new ArrayList<>();

		while (rs.next()) {
			ResultSetMetaData rsm = rs.getMetaData();
			int count = rsm.getColumnCount();
			String str = "";
			for (int i = 1; i <= count; i++) {
				str = str + " " + rs.getString(i);
			}
//			String resultSet = rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4);
			list.add(str);
		}

		return list;
	}

	public void insert(String tableName, HashMap<String, String> data) throws SQLException {

//		Iterator iterator = data.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry mapElement = (Map.Entry) iterator.next();
//			String key = (String) mapElement.getKey();
//			Object value = mapElement.getValue();
//			// insert into tablename(key) values(value);
//			String query = "insert into " + tableName + " (" + key + ",) "+"values (" + value + ",)";
//			stmt.executeUpdate(query);
		
		System.out.println("Inserting records ...");
	        String columnkey ="";
	        String columnvalues ="";
	        Statement stmt = con.createStatement();
	        
	        for(HashMap.Entry<String,String> elements : data.entrySet()) {
	            
	            String keys = elements.getKey();
	            columnkey = columnkey + keys + ",";
	            
	            String values = elements.getValue();
	            
	            if(values.charAt(0)>48 && values.charAt(0)<57)
	            columnvalues = columnvalues + values+",";
	            else
	                columnvalues = columnvalues +"'"+values+"',";
	        }
	        columnkey = columnkey.substring(0, columnkey.length()-1);
	        System.out.println(columnkey);
//	        for(HashMap.Entry<String,String> elements : m.entrySet()) {
//	        
//	            String values = elements.getValue();
//	            columnvalues = columnvalues + values+",";
//	            
//	        }
	        columnvalues = columnvalues.substring(0, columnvalues.length()-1);
	        System.out.println(columnvalues);
	        
	        String query = "INSERT INTO "+tableName +"("+columnkey+")"+" VALUES ("+columnvalues+")";
	        System.out.println(query);
	        PreparedStatement pr=con.prepareStatement(query);
	        pr.executeUpdate();
	        pr.close();
	        
	    }

}

