package Entites;

import java.time.LocalDate;

public class FullTime extends Employee{
	
	private double monthlySalary;
	
	public FullTime(String name, LocalDate dateOfJoning, String phone, String aadhaarNumber,double monthlySalary) {
		super(name, dateOfJoning, phone, aadhaarNumber);
		
		this.monthlySalary=monthlySalary;
	}
	
	

	public double getMonthlySalary() {
		return monthlySalary;
	}



	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



	@Override
	public String toString() {
		return "FullTime [ " + super.toString() + "monthlySalary=" + monthlySalary +"]";
	}

	
	
	

}
