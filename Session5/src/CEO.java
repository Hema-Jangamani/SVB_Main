import java.util.Scanner;

public class CEO extends Manager {

	private double Bonus;
	private int noOfManagersReporting;

	public CEO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CEO(int empId, String name, String address, double salary, String skillset, int customers, int experience,
			int teams, double bonus, double budget, double bonus2, int noOfManagersReporting) {
		super(empId, name, address, salary, skillset, customers, experience, teams, bonus, budget);
		Bonus = bonus2;
		this.noOfManagersReporting = noOfManagersReporting;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public int getNoOfManagersReporting() {
		return noOfManagersReporting;
	}

	public void setNoOfManagersReporting(int noOfManagersReporting) {
		this.noOfManagersReporting = noOfManagersReporting;
	}

	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter bonus:");
		Bonus = sc.nextInt();
		System.out.println("Enter no of reporting managers:");
		noOfManagersReporting = sc.nextInt();

	}

	@Override
	public String toString() {
		return "CEO [empId=" + getEmpId() + ", name=" + getName() + ", address=" + getAddress() + ", salary="
				+ getSalary() + ", skillset=" + getSkillset() + ", customers=" + getCustomers() + ", experience="
				+ getExperience() + ", teams=" + getTeams() + ", Bonus=" + getBonus() + ", budget=" + getBudget()
				+ ", Bonus=" + Bonus + ", noOfManagersReporting=" + noOfManagersReporting + "]";
	}

	void print() {
		super.print();
		System.out.println("Bonus: " + Bonus + "  " + "noOfManagersReporting: " + noOfManagersReporting);
	}
}
