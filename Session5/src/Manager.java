import java.util.Scanner;

public class Manager extends SoftwareEngineers {

	private int teams;
	private double Bonus;
	private double budget;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, String name, String address, double salary, String skillset, int customers,
			int experience, int teams, double bonus, double budget) {
		super(empId, name, address, salary, skillset, customers, experience);
		this.teams = teams;
		Bonus = bonus;
		this.budget = budget;
	}

	public int getTeams() {
		return teams;
	}

	public void setTeams(int teams) {
		this.teams = teams;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter teams:");
		teams = sc.nextInt();
		System.out.println("Enter bonus:");
		Bonus = sc.nextInt();
		System.out.println("Enter budget:");
		budget = sc.nextInt();

	}

	@Override
	public String toString() {
		return "Manager [empId=" + getEmpId() + ", name=" + getName() + ", address=" + getAddress() + ", salary="
				+ getSalary() + ", skillset=" + getSkillset() + ", customers=" + getCustomers() + ", experience="
				+ getExperience() + ", teams=" + teams + ", Bonus=" + Bonus + ", budget=" + budget + "]";
	}

	void print() {
		super.print();
		System.out.println("Teams: " + teams + "  " + "Bonus: " + Bonus + "  " + "Budget: " + budget);
	}
}
