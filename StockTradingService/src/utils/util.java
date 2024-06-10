package utils;

import Entites.Stock;
import static utils.validation.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import CustomException.StockException;
public class util {

	public static Stock addStock(String sid,String sname,String companyname,double price,String date,int quantity,List<Stock> slist) throws StockException
	{
		String id=chckDuplicate(sid,slist);
		LocalDate cdate=stockClosingDate(date);
		
		return new Stock(id, sname, companyname, price, cdate, quantity);
	}
	
	public static Stock purchaseStock(String sid,int qty,List<Stock> slist) throws StockException
	{
		for(Stock s: slist)
		{
			if(s.getStockId().equals(sid))
			{
				if(s.getQty()>qty)
				{
					int quantity=s.getQty()-qty;
					s.setQty(quantity);
					return s;
				}
			}
		}
		throw new StockException("Insufficient available quantity");
	}
	
	
	public static Stock sellStock(String sid,int qty,List<Stock> slist) throws StockException
	{
		for(Stock s: slist)
		{
			if(s.getStockId().equals(sid))
			{
				if(s.getQty()>qty)
				{
					int quantity=s.getQty()+qty;
					s.setQty(quantity);
					return s;
				}
			}
		}
		throw new StockException("Insufficient available quantity");
	}
	
	public static String updatePrice(String sid,double price,List<Stock> slist) throws StockException
	{
		for(Stock s: slist)
		{
			if(s.getStockId().equals(sid))
			{
				s.setPrice(price);
				return "Stock price updated successfully";
			}
		}
		throw new StockException("Invalid stock id");
	}
	
	public static String deleteStock(String sid,List<Stock> slist) throws StockException 
	{
		Iterator<Stock> itr=slist.iterator();
		while(itr.hasNext())
		{
			Stock s=itr.next();
			if(s.getStockId().equals(sid))
			{
				itr.remove();
				return "Stock deleted successfully";
			}
		}
		throw new StockException("Invalid stock id");
	}
	
	public static Stock SearchByName(String name,List<Stock> slist) throws StockException
	{
		for(Stock s : slist)
		{
			if(s.getStockname().equals(name))
			{
				return s;
			}
		}
		throw new StockException("Invalid Stock name");
	}
}
