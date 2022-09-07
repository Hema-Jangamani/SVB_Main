
public class CEO extends Manager {

	private int Bonus;
	private int noOfManagersReporting;

	public CEO(int empId, String name, String address, int salary, String skillset, String customers, int experience,
			String teams, int bonus, int budget, int bonus2, int noOfManagersReporting) {
		super(empId, name, address, salary, skillset, customers, experience, teams, bonus, budget);
		Bonus = bonus2;
		this.noOfManagersReporting = noOfManagersReporting;
	}

	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	public int getNoOfManagersReporting() {
		return noOfManagersReporting;
	}

	public void setNoOfManagersReporting(int noOfManagersReporting) {
		this.noOfManagersReporting = noOfManagersReporting;
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
