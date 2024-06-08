package utils;

import java.util.List;

import Entites.Cricketer;
import cricketerException.CricketerException;

public class validation {

	public static int validateAge(int age) throws CricketerException
	{
		if(age<20)
			throw new CricketerException("Age is not supported");
		return age;
	}
	
	public static String validateEmail(String email,String PhoneNo,List<Cricketer> clist) throws CricketerException
	{
		for(Cricketer c:clist)
		{
		if(c.getEmail_id().equals(email))
		{
			if(c.getPhoneNo().equals(PhoneNo))
			{
				
				throw new CricketerException("Duplicate email_id and phoneNo");
			}			
		}
		}
		return email;
	}
	
	
	public static int validateRating(int rating) throws CricketerException
	{
		if(rating>5)
			throw new CricketerException("Rate should be less than 5");
		return rating;
	}
}
