package com.brillio.dbdriver;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBManager DBObject = new DBManager("jdbc");
		Scanner sc = new Scanner(System.in);
		List<String> a = DBObject.getAll(sc.nextLine());
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
	        map.put("idEmployee", "2");
	        map.put("FirstName", "Hema");
	        map.put("LastName", "J");
	        map.put("Salary", "25000");
	        DBObject.insert("employee",map);
	}

}
