package utils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import static utils.validation.*;
import Entites.Item;
import exception.itemException;

public class utility {
	
	public static  Item addItem(String itemcode,String description,double price,String sdate,List<Item> ilist) throws itemException
	{
		String icode=chckDuplication(itemcode,ilist);
		LocalDate date=validateDate(sdate);
		
		return new Item(icode, description, price, date);
	}
	
	public static String UpdateDescription(String Itemcode,String description,List<Item> ilist)
	{
		//Item i=new Item(Itemcode);
		for(Item i:ilist)
		{
			if(i.getItemcode().equals(Itemcode)) {
				i.setDescription(description);
				return "Description update successfully";
			}
		}
		return "Item code is not found";
	}
	
	
	public static String DeleteItem(String itemcode,List<Item> ilist)
	{
		
		
		Iterator<Item> itr=ilist.iterator();
		while(itr.hasNext())
		{
			Item i=itr.next();
			if(i.getItemcode().equals(itemcode))
			{
				itr.remove();
				return "Item removed successfully";
			}
			
		}
		return "Item code is not found in the list"; 
	}
	
	
}
