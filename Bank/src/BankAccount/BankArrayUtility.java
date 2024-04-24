package BankAccount;

import java.util.Scanner;

public class BankArrayUtility {

	static Scanner in= new Scanner(System.in);
	
	public static void acceptdetails(BankAccount[] barr)
	{
		
		
			System.out.println("Enter the account id : ");
			int accountid=in.nextInt();
			System.out.println("Enter the name of account holder : ");
			String accountHolder=in.next();
			System.out.println("Enter the initial balance : ");
			double balance=in.nextDouble();
			
			
		BankAccount b= new BankAccount(accountid,accountHolder,balance);
		
	}

	public static void depositmoney(BankAccount[] barr)
	{
	System.out.println("Enter the account id ");
	int id = in.nextInt();
	
	for(int i=0;i<barr.length;i++)
	{
	     if(barr[i] .getAccountid()== id)
	     {
	    	 System.out.println("Enter the amount : ");
	    	 double amount = in.nextDouble();
	    	barr[i].deposit(amount);
	    	
	     }
	    
	     

	}
	}
	
	public static void withdrawmoney(BankAccount[] barr)
	{
	System.out.println("Enter the account id ");
	int id = in.nextInt();
	
	for(int i=0;i<barr.length;i++)
	 {
	     if(barr[i] .getAccountid()== id)
	     {
	    	 System.out.println("Enter the amount : ");
	    	 double amount = in.nextDouble();
	    	barr[i].withdraw(amount);
	     }
	    
	     

	   }
	
	
	}
	
	
	public static void display(BankAccount[] barr)
	{
		
		for(int i=0;i<barr.length;i++) {
			barr[i].displayAccountdetails();
		}
	}
	
	
}
