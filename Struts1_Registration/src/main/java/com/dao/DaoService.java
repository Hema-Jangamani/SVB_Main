package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class DaoService {
	private String dBName;
	private String user;
	private String password;

	public DaoService(String dBName, String user, String password) {
		super();
		this.dBName = dBName;
		this.user = user;
		this.password = password;
	}

	public List<List<String>> get(String tableName) {
		List<List<String>> list = new ArrayList<>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.dBName, this.user,
					this.password);

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from " + tableName);
			while (rs.next()) {
				List<String> l1=new ArrayList<>();
				ResultSetMetaData rsmd = rs.getMetaData();
				int count = rsmd.getColumnCount();
				for (int i = 1; i <= count; i++)
					l1.add(rs.getString(i));
				list.add(l1);
			}
			rs.close();
			stmt.close();
			Iterator<List<String>> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}

		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
		return list;

	}

	public void insertIntoDb(String tableName, HashMap<String, String> mapobj) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.dBName, this.user,
					this.password);
			String qs = "?";
			for (int i = 1; i < mapobj.size(); i++) {
				qs = qs + ",?";
			}
			String clmName="";
			for (Entry<String, String> mo : mapobj.entrySet()) {
				clmName=clmName+mo.getKey()+",";
			}
			clmName=clmName.substring(0, clmName.length() - 1);
			
			PreparedStatement ps=con.prepareStatement("insert into "+tableName+" ("+clmName+") values ("+qs+")");
			System.out.println(ps);
			int j = 1;
			while (j<= mapobj.size()) {
				for (Entry<String, String> mo : mapobj.entrySet()) {
					ps.setString(j, mo.getValue());
					j++;
				}
			}
			int i = ps.executeUpdate();
			System.out.println(i + " rows updated");
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
	public void updateIntoDB(String tableName, String password,String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.dBName, this.user,
					this.password);
			PreparedStatement stmt = con.prepareStatement("update " + tableName+" set password=? where email=?");
			stmt.setString(1, password);
			stmt.setString(2,email);
			int rowsUpdated = stmt.executeUpdate();
			stmt.close();
			System.out.println(rowsUpdated + " rows updated");
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
			e.printStackTrace();
		}
		}
}
