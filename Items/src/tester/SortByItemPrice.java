package tester;

import java.util.Comparator;

import Entites.Item;

public class SortByItemPrice implements Comparator<Item> {

	@Override
	public int compare(Item i1, Item i2) {
		 double price1 = i1.getPrice();
	        double price2 = i2.getPrice();
	        
	        // Compare the prices
	        if (price1 < price2) {
	            return -1;
	        } else if (price1 > price2) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
	}
	
