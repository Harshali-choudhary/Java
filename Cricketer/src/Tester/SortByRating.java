package Tester;

import java.util.Comparator;

import Entites.Cricketer;

public class SortByRating implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		
		return Integer.compare(c1.getRating(), c2.getRating());
	}

}
