package utils;

import java.time.LocalDate;
import java.util.List;

import CustomException.StockException;
import Entites.Stock;

public class validation {

	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static String chckDuplicate(String sid,List<Stock> slist) throws StockException
	{
		for(Stock s:slist)
		{
			if(s.getStockId().equals(sid))
			{
				throw new StockException("Stock id already present");
			}
		}
		return sid;
	}
	
	public static LocalDate stockClosingDate(String date) throws StockException
	{
		LocalDate cdate=validateDate(date);
		if(cdate.isAfter(LocalDate.now()))
		{
			return cdate;
		}
		else
		{
			throw new StockException("closing date is validate");
		}
	}
	
	
	
	
}
