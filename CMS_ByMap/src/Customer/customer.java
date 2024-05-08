package Customer;

import java.time.LocalDate;

public class customer {

	private int cid;
	private String Firstname;
	private String lastname;
	private String Email;
	private String Password;
	private double reg_amt;
	private LocalDate DoB;
	private ServicePlan plan;
	private static int counter =1;
	
	//Parameterised Constructor 
	public customer( String firstname, String lastname, String email, String password, double reg_amt,
			LocalDate doB, ServicePlan plan) {
		
		cid = counter++;
		Firstname = firstname;
		this.lastname = lastname;
		Email = email;
		Password = password;
		this.reg_amt = reg_amt;
		DoB = doB;
		this.plan = plan;
	}
	
//	//Unique key Constructor
//	public customer(String Email)
//	{
//		this.Email=Email;
//	}

	
	
	//Getter and Setter of Customer
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public double getReg_amt() {
		return reg_amt;
	}

	public void setReg_amt(double reg_amt) {
		this.reg_amt = reg_amt;
	}

	public LocalDate getDoB() {
		return DoB;
	}

	public void setDoB(LocalDate doB) {
		DoB = doB;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	
	@Override
	public String toString()
	{
		return "Customer id : "+ cid +" First Name : "+ Firstname +
				" Last name : "+ lastname +" Email : " + Email + 
				" Password : " +Password + " registration email : "+ reg_amt +
				"DAte of birth : "+ DoB +" Service Plan : "+plan;
	}
	
//	@Override
//	public boolean equals(Object o)
//	{
//		if(o instanceof customer)
//		{
//			customer c = (customer)o;
//		return (this.Email).equals(c.Email);
//		}
//		return false;
//		
//	}
//	
//	//natural ordering
//	public int compareTo(customer c)
//	{
//		//customer
//		return this.Email.compareTo(c.Email);
//			
//		
//	}
//	
	
}
