package utils;

import java.time.LocalDate;
import java.util.List;

import Entites.Item;
import exception.itemException;

public class validation {

	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static String chckDuplication(String itemcode,List<Item>  ilist) throws itemException
	{
		for(Item i: ilist)
		{
			if(i.getItemcode().equals(itemcode))
			{
				throw new itemException("This code item is already saved");
			}
			
		}
		return itemcode;
	}
}
