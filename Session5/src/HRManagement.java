import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

	public static void main(String[] args) {
		Employee e1 = new CEO(1,"Hema", "Gadag", 25000, "Java,Springboot,React", "BMS", 2, "BMS_project", 5000, 200000,
				8000, 20);
		Employee e2 = new Employee(2, "Soumya", "Belgaum", 30000);
//		Employee e3 = new Employee(3, "Soujanya", "Gulbarga", 35000);

		HRManagement hr = new HRManagement();
		// TODO Auto-generated method stub
		hr.populate(e1);
		hr.populate(e2);
//		hr.populate(e3);
		hr.display();
	}

}
