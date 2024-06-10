package tester;

import java.util.Comparator;

import Entites.Employee;

public class SortByDateOfJoining implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2)
	{
		return o1.getDateOfJoning().compareTo(o2.getDateOfJoning());
	}

}
