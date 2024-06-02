package Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import customerException.CustomerException;

import static validation.ValidationRules.*;
import entites.Customer;

public class CustomerApp {

	public static void main(String[] args)
	{
		List<Customer> customerList=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Registration/n 2.Display List/n 3.SignUp/n 4.Update Password/n 5.Delete Customer 0.Exit");
				System.out.println("Enter the choice :");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the details - firstname,lastname,email,password,dob,plan,serviceplan");
					Customer customer;
					customer=Registration(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),customerList);
					customerList.add(customer);
					break;
				case 2:
					System.out.println("The list of customer : ");
					for(Customer c: customerList)
					{
						System.out.println(c);
					}
					break;
				case 3:
					System.out.println("Enter the email and password :");
					String mesg=Login(sc.next(), sc.next(), customerList);
					System.out.println(mesg);
					break;
				case 4:
					System.out.println("Enter the email,oldPassword,newPassword : ");
					String message=updatePassword(sc.next(),sc.next(),sc.next(), customerList);
					System.out.println(message);
					break;
				case 5:
					System.out.println("Enter the emails : ");
					String m= deleteCustomer(sc.next(), customerList);
					System.out.println(m);
					break;
				case 0:
					System.out.println("Thankyou visit again!!!");
					exit=true;
					break;
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
