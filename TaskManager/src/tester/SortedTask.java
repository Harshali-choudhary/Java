package tester;

import java.util.Comparator;

import entities.Task;

public class SortedTask implements Comparator<Task> {

	@Override
	public int compare(Task o1, Task o2) {
		return o1.getTdate().compareTo(o2.getTdate());
	}

}
