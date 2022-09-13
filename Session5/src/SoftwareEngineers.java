import java.util.Scanner;

public class SoftwareEngineers extends Employee {

	private String skillset;
	private int customers;
	private int experience;

	public SoftwareEngineers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareEngineers(int empId, String name, String address, double salary, String skillset, int customers,
			int experience) {
		super(empId, name, address, salary);
		this.skillset = skillset;
		this.customers = customers;
		this.experience = experience;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public int getCustomers() {
		return customers;
	}

	public void setCustomers(int customers) {
		this.customers = customers;
	}

	public int getExperience() {
		return experience;
	}

	public void setExpirience(int experience) {
		this.experience = experience;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter skillset:");
		skillset = sc.next();
		System.out.println("Enter customers:");
		customers = sc.nextInt();
		System.out.println("Enter experience:");
		experience = sc.nextInt();

	}

	@Override
	public String toString() {
		return "SoftwareEngineers [empId=" + getEmpId() + ", name=" + getName() + ", address=" + getAddress()
				+ ", salary=" + getSalary() + ", skillset=" + skillset + ", customers=" + customers + ", experience="
				+ experience + "]";
	}

	void print() {
		super.print();
		System.out.println(
				"Skillset: " + skillset + "  " + "Customers: " + customers + "  " + "Experience: " + experience);
	}

}
