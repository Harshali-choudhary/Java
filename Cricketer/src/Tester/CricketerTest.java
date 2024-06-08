package Tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.util.*;
import Entites.Cricketer;

public class CricketerTest {

	public static void main(String[] args) {
		
		List<Cricketer> clist=new ArrayList<>();
		
		boolean exist=false;
		try(Scanner sc=new Scanner(System.in))
		{
			while(!exist)
			{
				System.out.println("1.Add Cricketer\n2.Upadte Rating\n3.Search cricketer\n4.Display cricketer\n5.Sort by rating\n0.exits");
				System.out.println("Enter the choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the details : name, Age, Email_id, Phone, rating");
					Cricketer c=AddCricketer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),clist);
					if(clist.add(c))
					System.out.println("Cricketer add successfully");
					else
						System.out.println("Cricketer not added in the list");
					break;
				case 2:
					System.out.println("Enter the email_id and rating : ");
					System.out.println(ModifyRating(sc.next(),sc.nextInt(), clist));
					break;
				case 3:
					System.out.println("Enter the name: ");
					SearchByName(sc.next(), clist);
					break;
				case 4:
					System.out.println("Details of Cricketer are : ");
					for(Cricketer c1: clist)
					{
						System.out.println(c1);
					}
					break;
				case 5:
					System.out.println("Cricketer sorted by rating : ");
					Collections.sort(clist,new SortByRating());
					for(Cricketer cricket: clist)
					{
						System.out.println("Name : "+cricket.getName()+" rating : "+cricket.getRating());
					}
						break;
				case 0:
					System.out.println("Thank you vist again");
					exist=true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
