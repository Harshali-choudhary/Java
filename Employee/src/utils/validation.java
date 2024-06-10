package utils;

import java.time.LocalDate;
import java.util.List;

import Entites.Employee;
import Exception.EmployeeException;

public class validation {
	
	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static String validatePhone(String phone) throws EmployeeException
	{
		String s="^[0-9]*$";
		if(phone!=null &&  phone.matches(s))
		{
			return phone;
		}
		else
		{
		    throw new EmployeeException("Invalid phone no.");
		}
	}
	
	public static String validateAadhar(String Anumber) throws EmployeeException
	{
		
		String s="^\\S+$";
		
		if(Anumber!=null && Anumber.matches(s))
		{
			return Anumber;
		}
		throw new EmployeeException("Invalid Aadhaar number");
	}
	
	public static String chckDuplicate(String Aadhaarno,List<Employee> elist) throws EmployeeException
	{
		for(Employee e: elist)
		{
			if(e.getAadhaarNumber().equals(Aadhaarno))
			{
				throw new EmployeeException("Aadhaar number is already used");
			}
		}
		return validateAadhar(Aadhaarno);
	}

}
