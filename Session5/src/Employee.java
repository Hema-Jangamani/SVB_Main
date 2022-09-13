import java.util.Scanner;

public class Employee {

	private int empId;
	private String name;
	private String address;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String address, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter employee ID:");
		empId = sc.nextInt();
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter address:");
		address = sc.next();
		System.out.println("Enter salary:");
		salary = sc.nextInt();

	}

	void print() {
		System.out.println("Name: " + name + "  " + "Address: " + address + "  " + "Salary: " + salary);
	}

}
