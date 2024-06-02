package validation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import customException.CustomException;
import entites.BankAccount;
import entites.accounttype;

public class ValidationRule {
//add a method to check minimum balance
	public static void minBalance(accounttype type, double balance) throws CustomException
	{
		if(balance<type.getGetMin())
		{
			 throw new CustomException("Minimum balance is not sufficient");
		}
			
		System.out.println("minimun balance is sufficient");	
	}
	
	//add a method to check accountype
	public static accounttype chckAccountType(String actype)
	{
		return accounttype.valueOf(actype.toUpperCase());
	}
	
	//add a method to convert string date into localdate
	public static LocalDate validateDate(String DOB)
	{
		LocalDate date=LocalDate.parse(DOB);
		return date;
	}
	
	//add a method to chck for duplicate
	public static void chckForDuplicate(int acctno,List<BankAccount> list) throws CustomException
	{
		BankAccount bank=new BankAccount(acctno);
		for(BankAccount b: list)
		if(b!= null & bank.equals(acctno) )
			throw new CustomException("already created account");
			
	}
	
	//add a method to add account in a bank
	public static BankAccount AddAccount(int accountNo, String firstName, String lastname, String acctype, String dob,
			String acc_creationDate, double balance,List<BankAccount> banklist) throws CustomException
	{
		
		chckForDuplicate(accountNo,banklist);
		accounttype type=chckAccountType(acctype);
		LocalDate Dob=validateDate(dob);
		minBalance(type, balance);
		
		return new BankAccount(accountNo, firstName, lastname, type, dob, acc_creationDate, balance);
	}
	
}
