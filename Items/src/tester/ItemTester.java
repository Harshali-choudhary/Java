package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.utility.*;
import Entites.Item;

public class ItemTester {
	
	public static void main(String[] args)
	{
		List<Item> ilst=new ArrayList<>();
		
		try(Scanner sc=new Scanner(System.in))
		{
		
			boolean exist=false;
			while(!exist)
			{
				System.out.println("1.Add items\n2.Dispaly list\n3.Update description\n4.Delete item\n5.Sort by item code\n6.Sort by item price\n0.Exist");
				System.out.println("Enter the choice: ");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1: 
					System.out.println("Enter the details - Itemcode, description, price, Shipmentdate");
					Item i=addItem(sc.next(), sc.next(), sc.nextDouble(),sc.next(), ilst);
					if(ilst.add(i))
					{
							System.out.println(i);
						System.out.println("Item added successfully");
					}
					else
					{
						System.out.println("Item cann't add in the list");
					}
					
					break;
				case 2:
					System.out.println("List of items are : ");
					for(Item list:ilst)
					{
						System.out.println(list);
					}
					break;
				case 3:
					System.out.println("Enter the itemcode,description : ");
					String s=UpdateDescription(sc.next(), sc.next(), ilst);
					System.out.println(s);
					break;
				case 4:
					System.out.println("Enter the Itemcode : ");
					String mesg=DeleteItem(sc.next(), ilst);
					System.out.println(mesg);
					break;
				case 5:
					System.out.println("Sort item as per the item code : ");
					Collections.sort(ilst);
					for(Item its: ilst)
					{
						System.out.println(its);
					}
					break;
				case 6:
					System.out.println("Sort item as per the item price : ");
					Collections.sort(ilst, new SortByItemPrice());
					for(Item it: ilst)
					{
						System.out.println(it);
		
					}
					break;
				case 0:
					exist=true;
					System.out.println("Thank you Vist again");
				}
			}
		}catch(Exception  e)
		{
			System.out.println(e);
		}
	}

}
