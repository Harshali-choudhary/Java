package Entites;

import java.time.LocalDate;

public class PartTime extends Employee{
	
	private double hourlyPayment;
	
	public PartTime(String name, LocalDate dateOfJoning, String phone, String aadhaarNumber,double hourlyPayment) {
		super(name, dateOfJoning, phone, aadhaarNumber);
		
		this.hourlyPayment=hourlyPayment;
	}

	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public String toString() {
		return "PartTime [ " + super.toString() + "hourlyPayment=" + hourlyPayment +"]";
	}
	
	
	

}
