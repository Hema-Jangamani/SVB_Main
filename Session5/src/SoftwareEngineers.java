
public class SoftwareEngineers extends Employee {

	private String skillset;
	private String customers;
	private int experience;

	public SoftwareEngineers(int empId, String name, String address, int salary, String skillset, String customers,
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

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public int getExperience() {
		return experience;
	}

	public void setExpirience(int experience) {
		this.experience = experience;
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
