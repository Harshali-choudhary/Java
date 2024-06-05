package utils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import entities.Status;
import entities.Task;
import static utils.TaskValidation.*;
public class TaskUtils 
{
//add a method to add a task in TaskManager
	public static Task addTask(String tname, String description, String tdate, String  s, boolean active)
	{
		LocalDate date =validateDate(tdate);
		Status status=validateStatus(s);
		
		return new Task(tname, description, date, status, active);
	}
	
	//add a method to delete task
	public static String removeTask(int id ,List<Task> tasklist)
	{      
		Iterator<Task> itr=tasklist.iterator();
		while(itr.hasNext())
			{
			 Task t=itr.next();
			 if(t.getTid()==id)
			 {
				 itr.remove();
			 }
			}
		return "Task removed successfully";
		
	}
     
	//add a method to update list
	public static String updateTask(int id,String status)
	{
		Status s=validateStatus(status);
		Task t=new Task(id);
		t.setStatus(s);
		return "Status is update successfull";
	}
	
	//add a method to display all pending task
	public static void pendingTask(List<Task> tasklist)
	{
		for(Task t: tasklist)
		{
			if(t.isActive()&&t.getStatus() == Status.PENDING)
			{
				System.out.println(t);
			}
		}
	}
	
	//add a method to display pending task of today
	public static void pendingTaskToday(List<Task> tasklist)
	{
		for(Task t: tasklist)
		{
			if(t.getStatus() == Status.PENDING && t.getTdate().equals(LocalDate.now()))
			{
				System.out.println(t);
			}
		}
	}
}
