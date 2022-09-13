import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.brillio.dbdriver.DBManager;

public class HRManagement {

	Map<Integer, Employee> obj = new HashMap<>();

	public void populate(Employee emp) {
		obj.put(emp.getEmpId(), emp);
	}

	public void display() {
		for (Map.Entry<Integer, Employee> entry : obj.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

	@Override
	public String toString() {
		return "HRManagement [obj=" + obj + "]";
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);

		CEO e1 = new CEO();

		HRManagement hr = new HRManagement();

		e1.accept(sc);
		hr.populate(e1);
		hr.display();

		DBManager dbobj = new DBManager("hrsystems", "root", "root");

		HashMap<String, String> map = new HashMap<String, String>();

		// id,name, address, salary, skillset, customers, experience, teams, bonus,
		// budgets, bonus, noOfManagersreporting
		map.put("empId", String.valueOf(e1.getEmpId()));
		map.put("name", e1.getName());
		map.put("address", e1.getAddress());
		map.put("salary", String.valueOf(e1.getSalary()));
		map.put("skillset", e1.getSkillset());
		map.put("customers", String.valueOf(e1.getCustomers()));
		map.put("experience", String.valueOf(e1.getExperience()));
		map.put("teams", String.valueOf(e1.getTeams()));
		map.put("bonus", String.valueOf(e1.getBonus()));
		map.put("budgets", String.valueOf(e1.getBudget()));
		map.put("bonuss", String.valueOf(e1.getBonus()));
		map.put("noOfManagersreporting", String.valueOf(e1.getNoOfManagersReporting()));

		dbobj.insert("ceo", map);

		ArrayList<String> list = dbobj.getAll("ceo");

		for (String emp : list) {
			System.out.println(emp);
		}

	}

}
