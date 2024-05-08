package CustomOrdering;

import java.util.Comparator;

import Customer.customer;

public class customOrderingbyDobAndLastname implements Comparator<customer> {

	public int compare(customer c1,customer c2)
	{
		int d=c1.getDoB().compareTo(c2.getDoB());
		if(d ==0 )
		{
			return (c1.getLastname()).compareTo(c2.getLastname());
		}
		return d;
	}
	
}
