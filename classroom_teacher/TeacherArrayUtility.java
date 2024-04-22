package classroom_teacher;

import java.util.Scanner;

public class TeacherArrayUtility {

	public static void acceptdetails(Teacher[] arr)
	{
		Scanner in = new Scanner(System.in);
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the teacher id : ");
			int Teacherid = in.nextInt();
			System.out.println("Enter the teacher name : ");
			String Tname = in.next();
			System.out.println("Enter the classroom id : ");
			int roomid = in.nextInt();
			System.out.println("Enter the room name : ");
			String name = in.next();
			System.out.println("Enter 1.Professor 2.Asst_Professor ");
			int tcode = in.nextInt();
			Designation desg = null;
			switch(tcode)
			{
			case 1:
				desg = Designation.Professor;
				break;
			case 2:
				desg = Designation.Asst_Professor;
				break;
			}
	   arr[i]= new Teacher(Teacherid,Tname,desg,new classroom(roomid,name));
	   
		}
	
			
	}
	
	public static void displaydetails(Teacher[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
}
