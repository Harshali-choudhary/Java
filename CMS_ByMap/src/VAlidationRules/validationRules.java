package VAlidationRules;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

import CMSException.CMSException;
import Customer.ServicePlan;
import Customer.customer;

public class validationRules {

	// rules for checking duplicate email
	public static void CheckforDup(String email, Map<String,customer> customerMap) throws CMSException {
		//customer Customer = new customer(email);
		if (customerMap.containsKey(email))
			throw new CMSException("Email is already used.");

	}

	// rules for validate plan
	public static ServicePlan parsevalidateplan(String serviceplan, double amount) throws CMSException {
		ServicePlan sp = ServicePlan.valueOf(serviceplan.toUpperCase());
		if (sp.getamount() == amount)
			return sp;
		throw new CMSException("Insufficient amount for plan");
	}

	// Convert String date into LocalDate format
	public static LocalDate parseDob(String Dob) {
		return LocalDate.parse(Dob);

	}

	// Rule for validateInputs
	public static customer validateInputs(String firstname, String lastname, String email, String password,
			double reg_amt, String doB, String plan, Map<String,customer> Customer) throws CMSException {
		CheckforDup(email, Customer);
		ServicePlan sp = parsevalidateplan(plan, reg_amt);
		//LocalDate date = parseDob(doB);
		LocalDate date = validateAge(doB);
		// if(sp.valueOf(plan))
		 //validatePassword(password);
		return new customer(firstname, lastname, email, password, reg_amt, date, sp);
		//throw new CMSException("Wrong order of details.");
	}

	// Rule for signin
	public static customer validateSignin(String email, String password, Map<String,customer> CustomerMap) throws CMSException
	{
		//customer newcustomer = new customer(email);

		//int index = Customer.indexOf(newcustomer);
		if (CustomerMap.containsKey(email)) {
			customer customer2 = CustomerMap.get(email);
			if (customer2.getPassword().equals(password)) {
				System.out.println("Signin Successful");
				return customer2;
			}
			throw new CMSException("Wrong password ! ");
			
			
		}
		
		throw new CMSException("Invalid Email / Email is not Found");
	}
	
	//Rule for unsubscribe customer
	public static String deletecustomer(String email,Map<String,customer> CustomerMap) throws CMSException
	{
		//customer cust = new customer(email);
		//int index = Customerlist.indexOf(cust);
		if(CustomerMap.containsKey(email))
		{
			return (CustomerMap.remove(email).getFirstname());
			
			
		}
		throw new CMSException("Invalid email");
	}
	
	//Rule for Strong password
	public static void validatePassword(String Password) throws CMSException
	{
		String regexp= "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$*]){5,20})";
		
		if(Password.matches(regexp))
		System.out.println("Continue.");
		else
			throw new CMSException("Password is not Strong!");
	}
	
	//Rule for age >21
	public static LocalDate validateAge(String Dob) throws CMSException
	{
		LocalDate date = parseDob(Dob);
		int age = Period.between(LocalDate.now(), date).getYears();
		if(age>21)
			throw new CMSException("Age is not Supported for this System");
		return date;
	}
}
