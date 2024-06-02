package validation;

import java.time.LocalDate;
import java.util.List;

import customerException.CustomerException;
import entites.Customer;
import entites.ServiceType;

public class ValidationRules {

	//Add a method to register new user
	public static Customer Registration(String firstname, String lastname, String email, String password, String dob, String service,
			double serviceplan,List<Customer> customer) throws CustomerException
	{
		chckDuplicate(email, customer);
		validateDob(dob);
		ServiceType plan=validatePlan(service,serviceplan);
		if(serviceplan!=plan.getPlanCost())
			 throw new CustomerException("Invalid plan amount");
		return new Customer(firstname,lastname,email,password,dob,plan,serviceplan);	
	}
	
	//Add a method to validate dob
	public static LocalDate validateDob(String dob)
	{
		return LocalDate.parse(dob);
	}
	
	//Add a method to validate service
	public static ServiceType validatePlan(String service,double plan) throws CustomerException
	{
		ServiceType s =ServiceType.valueOf(service.toUpperCase());
		if(plan==s.getPlanCost())
		{
			return s;
		}
		throw new CustomerException("Invalid service plan");
	}
	
	//add a method for duplicate(email )
	public static void chckDuplicate(String email,List<Customer> customerList) throws CustomerException
	{
		Customer cust=new Customer(email);
		if(customerList.contains(email))
			throw new CustomerException("Email is already present");
		
	}
	//Add a method to login
	public static String Login(String email,String password,List<Customer> customerList) throws CustomerException
	{
		Customer cust=new Customer(email);
		int index=customerList.indexOf(cust);
		
		if(index==-1)
		throw new CustomerException("Invalid email, login failed !");
		
		Customer customer=customerList.get(index);
		if(customer.getPassword().equals(password))
		{
			return "Login Successful";
		}
		throw new CustomerException("Invalid password, login failed !");
	}
	
	//Add a method to update pasword
	public static String updatePassword(String email,String oldpassword,String newpassword,List<Customer> customerlist) throws CustomerException
	{
		Customer customer=new Customer(email);
		int index=customerlist.indexOf(customer);
		if(index==-1)
		throw new CustomerException("invalid email");
		Customer c=customerlist.get(index);
		c.getPassword();
		c.setPassword(newpassword);
		return "password update successful";
	}
	
	//Add a method to delete Customer
	public static String deleteCustomer(String email,List<Customer> customerlist)
	{
		Customer c= new Customer(email);
		int index=customerlist.indexOf(c);
		if(index==-1)
			throw new CustomerException("Invalid email");
		Customer cust=customerlist.remove(index);
		return "Customer Un-Subscribe successfully";
	}
}
