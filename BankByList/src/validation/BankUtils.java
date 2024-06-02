package validation;

import customException.CustomException;
import entites.BankAccount;

public class BankUtils {

	//add a static method to return a/c details or throw exec
	public static BankAccount findAccountDetailsByAccno(int accno,BankAccount[] banks)throws CustomException
	{
		BankAccount bank = new BankAccount(accno);
		for(BankAccount b :banks )
		{
			if(b!=null && b.equals(bank))
				return b;
		}
		throw new CustomException("invalid account no.");
	}
}
