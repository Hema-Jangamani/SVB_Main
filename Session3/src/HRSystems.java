
class Employee {
	private String name;
	private String address;
	private int salary;

	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void print() {
		System.out.println("Name: " + name + "  " + "Address: " + address + "  " + "Salary: " + salary);
	}
}

class SoftwareEngineers extends Employee {
	private String skillset;
	private String customers;
	private int experience;

	public SoftwareEngineers(String name, String address, int salary, String skillset, String customers, int experience) {
		super(name, address, salary);
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

	void print() {
		super.print();
		System.out.println("Skillset: " + skillset + "  " + "Customers: " + customers + "  " + "Experience: " + experience);
	}
}

class Manager extends SoftwareEngineers {
	private String teams;
	private String Bonus;
	private int budget;

	public Manager(String name, String address, int salary, String skillset, String customers, int experience,
			String teams, String bonus, int budget) {
		super(name, address, salary, skillset, customers, experience);
		this.teams = teams;
		Bonus = bonus;
		this.budget = budget;
	}

	public String getTeams() {
		return teams;
	}

	public void setTeams(String teams) {
		this.teams = teams;
	}

	public String getBonus() {
		return Bonus;
	}

	public void setBonus(String bonus) {
		Bonus = bonus;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	void print() {
		super.print();
		System.out.println("Teams: " + teams +"  "+ "Bonus: " + Bonus +"  "+ "Budget: " + budget);
	}
}

class Ceo extends Manager {
	private String Bonus;
	private int noOfManagersReporting;

	public Ceo(String name, String address, int salary, String skillset, String customers, int experience,
			String teams, String bonus, int budget, String bonus2, int noOfManagersReporting) {
		super(name, address, salary, skillset, customers, experience, teams, bonus, budget);
		Bonus = bonus2;
		this.noOfManagersReporting = noOfManagersReporting;
	}

	public String getBonus() {
		return Bonus;
	}

	public void setBonus(String bonus) {
		Bonus = bonus;
	}

	public int getNoOfManagersReporting() {
		return noOfManagersReporting;
	}

	public void setNoOfManagersReporting(int noOfManagersReporting) {
		this.noOfManagersReporting = noOfManagersReporting;
	}

	void print() {
		super.print();
		System.out.println("Bonus: " + Bonus + "  " + "noOfManagersReporting: " + noOfManagersReporting);
	}
}

public class HRSystems {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee c1 = new Ceo("Hema", "Gadag", 25000, "Java,Springboot,React", "BMS", 2, "BMS_project", "5%", 200000,
					"12%", 20);
			if (c1.getName() == "") {
				throw new Exception("Please enter the name");
			}
			c1.print();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
