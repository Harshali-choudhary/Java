package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.util.*;
import Entites.EmpType;
import Entites.Employee;

public class EmployeeTester {

	public static void main(String[] args) {
		
		List<Employee> elist=new ArrayList<>();
		
		
		boolean exit=false;
		
		try(Scanner sc=new Scanner(System.in))
		{
			while(!exit)
			{
				System.out.println("1.Add Employee\n2.Delete employee by id\n3.Search employee details by Aadhaar number\n"
						+ "4.Display all employee details\n5.Display all employee details sorted by date of joining\n0.Exit");
				System.out.println("Enter the choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the employee type : ");
					if(EmpType.valueOf(sc.next().toUpperCase())==EmpType.FULLTIME) {
						System.out.println("Enter the employee details - name, date Of joining, Phone, aadhaarNo, Salary");
						String s=addFulltimeEmployee(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),elist);
						System.out.println(s);
					}
					else {
						System.out.println("Enter the employee details - name, date Of joining, Phone, aadhaarNo, hourlyPayment");
						String s1=addParttimeEmployee(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(), elist);
						System.out.println(s1);
					}
					break;
				case 2:
					System.out.println("Enter the emp id : ");
					String str=DeleteEmployee(sc.nextInt(), elist);
					System.out.println(str);
					break;
				case 3:
					System.out.println("Enter the aadhaar no : ");
					System.out.println(Search(sc.next(), elist));
					break;
				case 4:
					System.out.println("The employee details are : ");
					for(Employee E :elist)
					{
						System.out.println(E);
					}
					break;
				case 5:
					Collections.sort(elist,new SortByDateOfJoining());
					for(Employee e: elist)
					{
						System.out.println(e);
					}
					break;
				case 0:
					System.out.println("Thank you visit again");
					exit=true;
					
				}
			}
			
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}

}
