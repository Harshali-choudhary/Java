package utils;

import java.time.LocalDate;

import entities.Status;

public class TaskValidation {

	public static LocalDate validateDate(String date)
	{
		return LocalDate.parse(date);
	}
	
	public static Status validateStatus(String status )
	{    
		Status s=Status.valueOf(status.toUpperCase());
		return s;
	}
}
