package entites;

public class Customer {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String dob;
	private ServiceType service;
	private double serviceplan;
	
	

	public Customer(String email) {
		
		this.email = email;
	}


	public Customer(String firstname, String lastname, String email, String password, String dob, ServiceType service,
			double serviceplan) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.service = service;
		this.serviceplan = serviceplan;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public ServiceType getService() {
		return service;
	}


	public void setService(ServiceType service) {
		this.service = service;
	}


	public double getServiceplan() {
		return serviceplan;
	}


	public void setServiceplan(double serviceplan) {
		this.serviceplan = serviceplan;
	}


	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", service=" + service + ", serviceplan=" + serviceplan + "]";
	}


	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
		{
			Customer c=(Customer)o;
					return this.email.equals(c.email);
		}
		return false;
		
	}
	
	
	
}
