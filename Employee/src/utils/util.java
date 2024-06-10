package utils;

import static utils.validation.chckDuplicate;
import static utils.validation.validateDate;
import static utils.validation.validatePhone;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import Entites.Employee;
import Entites.FullTime;
import Entites.PartTime;
import Exception.EmployeeException;

public class util {
	
	public static String addFulltimeEmployee(String name,String dateOfJoining,String phone,String Aadhaarno,double Salary,List<Employee> elist) throws EmployeeException
	{
		String Phone=validatePhone(phone);
		String aadhaarNo=chckDuplicate(Aadhaarno, elist);
		LocalDate d=validateDate(dateOfJoining);
		elist.add(new FullTime(name, d, Phone, aadhaarNo, Salary));
		return "Employee is added successfully" ;
	}
	
	public static String addParttimeEmployee(String name,String dateOfJoining,String phone,String Aadhaarno,double hourlyPayment,List<Employee> elist) throws EmployeeException
	{
		String Phone=validatePhone(phone);
		String aadhaarNo=chckDuplicate(Aadhaarno, elist);
		LocalDate d=validateDate(dateOfJoining);
		elist.add(new PartTime(name, d, Phone, aadhaarNo, hourlyPayment));
		return "Employee is added successfully" ;
	}
	
	public static String DeleteEmployee(int empid,List<Employee> elist)
	{
		//Employee e=new Employee(empid);
		Iterator<Employee> itr=elist.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			if(e.getEmpid()==empid)
			{
				itr.remove();
				return "Employee removed successfully";
			}
		}
		return "Employee id is not found";
		
	}
	
	public static Employee Search(String Aadhaarno,List<Employee> elist) throws EmployeeException
	{
		for(Employee e:elist)
		{
			if(e.getAadhaarNumber().equals(Aadhaarno))
			{
				return e;
			}
		}
		throw new EmployeeException("Aadhaar no. is not found");
	}

}
