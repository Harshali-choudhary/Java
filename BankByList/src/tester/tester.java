package tester;

import java.util.ArrayList;
import java.util.Scanner;
import static validation.ValidationRule.AddAccount;
import entites.BankAccount;


public class tester {

	
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			
			
			ArrayList<BankAccount> banklist= new ArrayList<BankAccount>();
			while(!exit)
			{
				System.out.println("1.Add account/n 2.Display Account/n 3.Withdraw/n 4.Deposit/n 5.Transfer funds/n 0.exits");
				System.out.println("Enter the choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
				
				case 1:
					System.out.println("Enter the account details :  accountNo, firstName, lastname, acctype, dob, acc_creationDate,  balance");
					BankAccount bank=AddAccount(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),banklist);
					banklist.add(bank);
					System.out.println(bank);
					break;
				case 2:
					System.out.println("The list of bank is :");
					for(BankAccount b : banklist)
						System.out.println(b);
					break;
				case 3:
					System.out.println("Enter the account no : ");
					int accNo=sc.nextInt();
					BankAccount foundaccount=null;
					for(BankAccount b : banklist)
					{
						if(accNo==b.getAccountNo())
						foundaccount=b;
						break;
					}
					
					if(foundaccount != null)
					{
					double bal=foundaccount.getBalance();
					System.out.println("enter the withdraw amount :");
					double amount=sc.nextDouble();
					double total=foundaccount.withdraw(bal, amount);
					foundaccount.setBalance(total);
					System.out.println("total amount in account is : "+total);
					}
					else
					{
						System.out.println("Account is not found");
					}
					break;
				case 4:
					System.out.println("Enter the account no : ");
					int accno=sc.nextInt();
					BankAccount bnk=null;
					for(BankAccount b : banklist)
					{
						if(accno==b.getAccountNo())
							bnk=b;
						break;
					}
					if(bnk != null)
					{
						double bal=bnk.getBalance();
						System.out.println("Enter the amount for deposit :");
						double amt=sc.nextDouble();
						double total=bnk.deposit(bal, amt);
						bnk.setBalance(total);
						System.out.println("the total balance is : "+total);
					}
					else {
						System.out.println("account is not found");
					}
					break;
				case 5:
					System.out.println("Enter your account no : ");
					int acct1=sc.nextInt();
					System.out.println("Enter the account no which do you want tranfer balance : ");
					int acct2=sc.nextInt();
					BankAccount bacct1=null;
					BankAccount bacct2=null;
					for(BankAccount b :banklist)
					{
						if(acct1 == b.getAccountNo())
						{
							bacct1=b;
		                    break;
						}
						
					}
					for(BankAccount b1 :banklist)
					{
						if(acct2 == b1.getAccountNo())
						{
							bacct2=b1;
							break;
						}
					}
					
					System.out.println(bacct1);
					System.out.println(bacct2);
					if(bacct1 != null && bacct2 != null)
					{
						System.out.println("Enter the amount : ");
						double amount=sc.nextDouble();
						double transferFund=bacct1.withdraw(bacct1.getBalance(), amount);
						bacct1.setBalance(transferFund);
						double transferedamount =bacct2.deposit(bacct2.getBalance(), amount);
						bacct2.setBalance(transferedamount);
					}
						
					else {
						System.out.println("account is not found");
					}
					break;
				case 0:
					System.out.println("Thankyou Vist again!!!!");
					exit=true;
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
