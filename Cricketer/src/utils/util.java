package utils;

import java.util.List;
import static utils.validation.*;
import Entites.Cricketer;
import cricketerException.CricketerException;

public class util {

	public static Cricketer AddCricketer(String name,int age,String email,String Phone,int rating,List<Cricketer> Clist) throws CricketerException
	{
		String Email_id=validateEmail(email,Phone,Clist);
		int Age=validateAge(age);
		int rate=validateRating(rating);
		
		return new Cricketer(name, Age, Email_id, Phone, rate);
	}
	
	public static String ModifyRating(String email_id,int rating,List<Cricketer> clist) throws CricketerException
	{
		for(Cricketer c:clist)
		{
			if(c.getEmail_id().equals(email_id))
			{
				int rate=validateRating(rating);
				c.setRating(rate);
			}
		}
		return "Rating is update successfully";	
	}
	
	public static void SearchByName(String name,List<Cricketer> clist)
	{
		for(Cricketer c:clist)
		{
			if(c.getName().equals(name))
			{
				System.out.println(c);
			}
		}
	}
}
