package com.brillio.model;

import javax.persistence.Entity;

@Entity(name = "softwareengg")
public class SoftwareEngineer extends Employee {

	private String skillset;
	private int customers;
	private int experience;

	public SoftwareEngineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareEngineer(int id, String name, String address, double salary, String skillset, int customers,
			int experience) {
		super(id, name, address, salary);
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

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "SoftwareEngineers [empId=" + getId() + ", name=" + getName() + ", address=" + getAddress() + ", salary="
				+ getSalary() + ", skillset=" + skillset + ", customers=" + customers + ", experience=" + experience
				+ "]";
	}

}
