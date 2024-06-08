package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.TaskUtils.*;
import entities.Task;

public class TaskApp {
	
	public static void main(String[] args)
	{
		List<Task> tasklist=new ArrayList<>();
		try(Scanner s=new Scanner(System.in))
		{
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Add Task \n 2.Display all list\n 3.Delete the task\n 4. update task status \n"
						+ "5. Display pending task \n 6.Display today pending task\n 7.Sorting\n 0.exit");
				System.out.println("Enter the choice ");
				int ch=s.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the details: tname, description, date, status, active");
					Task t=addTask(s.next(), s.next(), s.next(), s.next(), s.nextBoolean());
					tasklist.add(t);
					break;
				case 2:
					System.out.println("The list of the task is :");
					for(Task t1:tasklist)
					System.out.println(t1);
				     break;
				case 3:
					System.out.println("Enter the id : ");
					String mesg=removeTask(s.nextInt(), tasklist);
					System.out.println(mesg);
					break;
				case 4:
					System.out.println("Enter the id and status  :");
					String m=updateTask(s.nextInt(), s.next());
					System.out.println(m);
					break;
				case 5:
					pendingTask(tasklist);
					break;
				case 6:
					pendingTask(tasklist);
					break;
				case 7:
					Collections.sort(tasklist,new SortedTask());
					System.out.println("Sorted list of tasks : ");
					for(Task t1:tasklist)
					{
						System.out.println(t1);
					}
					break;
				case 0:
					System.out.println("Thank you visit again ");
					exit=true;
				}
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
