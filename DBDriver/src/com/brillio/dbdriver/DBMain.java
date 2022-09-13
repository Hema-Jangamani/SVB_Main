package com.brillio.dbdriver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		DBManager DBObject = new DBManager("jdbc","root","root");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = DBObject.getAll(sc.nextLine());
		System.out.println(a);
		
//		HashMap<String, String> map = new HashMap<>();
		
//		for(int i=1;i<=4;i++) {
//			String colname = sc.nextLine();
//			Object value = sc.next();
//			map.put(colname, value)
//		}
//		
//		map.put("idEmployee", 11);
//		map.put("FirstName", "Divya");
//		map.put("LastName", "U");
//		map.put("Salary", 50000);

		
		 HashMap<String,String> map= new HashMap<String,String>();
	        map.put("idEmployee", "5");
	        map.put("FirstName", "Shiv");
	        map.put("LastName", "K");
	        map.put("Salary", "20000");
	        DBObject.insert("employee",map);
	}

}
