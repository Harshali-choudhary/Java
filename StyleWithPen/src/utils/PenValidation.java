package utils;

import java.time.LocalDate;

import entites.Brand;

public class PenValidation {

	//add a method to validate the brand name
	public static Brand validateBrand(String Bname)
	{
		return Brand.valueOf(Bname.toUpperCase());
	}
	
	//add a method to validate date
	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	
}
