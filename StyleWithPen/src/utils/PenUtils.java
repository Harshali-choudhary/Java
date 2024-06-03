package utils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import static utils.PenValidation.*;
import CustomException.PenException;
import entites.Brand;
import entites.Pen;

public class PenUtils {

	// add a method to add a pen in list
	public static Pen addPen(String brand, String color, String inkColor, String material, int stock,
			String stockUpdatedate, String stockListingdate, double price, double discount) throws PenException
	{
		
		LocalDate SUpdateDate=validateDate(stockUpdatedate);
		LocalDate SListingDate=validateDate(stockListingdate);
		Brand Bname=validateBrand(brand);
		
		return new Pen(Bname, color, inkColor, material, stock, SUpdateDate, SListingDate, price, discount);
	}

//add a method to update stock
public static String StockUpdate(int Pid,int Stock,List<Pen> penlist) throws PenException
{
	Pen p=new Pen(Pid);
	int index=penlist.indexOf(p);
	//System.out.println(index);
	if(index==-1)
		throw new PenException("Pen is not found");
	Pen pens=penlist.get(index);
	pens.setStock(Stock);
	pens.setStockUpdatedate(LocalDate.now());
	return "Pen Stock is update successfully";
	
}

//add a method to add discount 20%
public static List<Pen> AddDiscount(List<Pen> penlist)
{
	LocalDate currentdate = LocalDate.now();
	LocalDate threeMonthAgo =currentdate.minusMonths(3);
	
	for(Pen p:penlist)
	{
		if(p.getStockListingdate().isBefore(threeMonthAgo))
		{
			double price=p.getPrice();
			double discountPrice=0.2*price;
			p.setPrice(discountPrice);
		}
	}
	return penlist;
}

//add a method to remove pen which are not sold from 9 months
public static String RemovePens(List<Pen> penlist)
{
	LocalDate currentDate=LocalDate.now();
	LocalDate nineMonthAgo=currentDate.minusMonths(9);
	Iterator<Pen> itr=penlist.iterator();
	while(itr.hasNext())
	{
		Pen p=itr.next();
		if(p.getStockListingdate().isBefore(nineMonthAgo))
		{
			itr.remove();
		}
	}
	return "pens removed successfully";
}
}