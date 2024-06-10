package Entites;

import java.time.LocalDate;

public class Employee {

	private int empid;
	private String name;
	private LocalDate DateOfJoning;
	private String phone;
	private String AadhaarNumber;
	private static int counter=1;
	private EmpType emptype;
	
	public Employee(int empid) {
		this.empid=empid;;
	}



	public Employee( String name, LocalDate dateOfJoning, String phone, String aadhaarNumber) {
		this.empid = counter++;
		this.name = name;
		DateOfJoning = dateOfJoning;
		this.phone = phone;
		AadhaarNumber = aadhaarNumber;
		
	}



	public EmpType getEmptype() {
		return emptype;
	}



	public void setEmptype(EmpType emptype) {
		this.emptype = emptype;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDateOfJoning() {
		return DateOfJoning;
	}



	public void setDateOfJoning(LocalDate dateOfJoning) {
		DateOfJoning = dateOfJoning;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAadhaarNumber() {
		return AadhaarNumber;
	}



	public void setAadhaarNumber(String aadhaarNumber) {
		AadhaarNumber = aadhaarNumber;
	}



	@Override
	public String toString() {
		return "empid=" + empid + ", name=" + name + ", DateOfJoning=" + DateOfJoning + ", phone=" + phone
				+ ", AadhaarNumber=" + AadhaarNumber ;
	}



	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			Employee e=(Employee)o;
			return this.empid==e.empid;
		}
		return false;
	}
	
	
}
