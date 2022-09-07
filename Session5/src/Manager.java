
public class Manager extends SoftwareEngineers {

	private String teams;
	private int Bonus;
	private int budget;

	public Manager(int empId, String name, String address, int salary, String skillset, String customers,
			int experience, String teams, int bonus, int budget) {
		super(empId, name, address, salary, skillset, customers, experience);
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

	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
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
