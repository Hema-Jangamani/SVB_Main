package com.brillio.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Within MySqlExample....");

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			Statement stmt = con.createStatement();
			
//			displayResultSet(stmt);
//			insertData(stmt);
//			updateData(stmt);
			
			try {
				PreparedStatement ps = con.prepareStatement("insert into employee(idEmployee,FirstName,LastName,Salary) "+"values(?,?,?,?)");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				do {
					System.out.println("Enter id: ");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter first name:");
					String fname = br.readLine();
					System.out.println("Enter last name:");
					String lname = br.readLine();
					System.out.println("Enter salary:");
					int salary = Integer.parseInt(br.readLine());
					
					ps.setInt(1, id);
					ps.setString(2, fname);
					ps.setString(3, lname);
					ps.setInt(4, salary);
					int i = ps.executeUpdate();
					System.out.println(i+" records affected");
					
					System.out.println("Do you want to continue: y/n");
					String s = br.readLine();
					if(s.startsWith("n")) {
						break;
					}
				}while(true);
				displayResultSet(stmt);
			}catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

	private static void displayResultSet(Statement stmt) throws SQLException {

		ResultSet rs = stmt.executeQuery("select * from employee");

		while (rs.next()) {
			String resultSet = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3);
			System.out.println(resultSet);
		}
	}

	private static void insertData(Statement stmt) throws SQLException {

		System.out.println("Inserting records into the table...");
		String sql = "INSERT INTO employee VALUES(6,'Saanya','S',30000)";
		stmt.executeUpdate(sql);
		displayResultSet(stmt);
	}

	private static void updateData(Statement stmt) throws SQLException {

		System.out.println("Updating records into the table...");
		String sql = "UPDATE employee " + "SET FirstName = 'Bhagya' WHERE idEmployee=6";
		stmt.executeUpdate(sql);
		displayResultSet(stmt);
	}

}
