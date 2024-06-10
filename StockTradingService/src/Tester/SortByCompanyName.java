package Tester;

import java.util.Comparator;

import Entites.Stock;

public class SortByCompanyName implements Comparator<Stock> {

	@Override
	public int compare(Stock s1, Stock s2) {
		
		return s1.getCompanyname().compareTo(s2.getCompanyname());
	}
	

}
