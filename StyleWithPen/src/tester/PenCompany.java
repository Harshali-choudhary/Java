package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.PenUtils.*;
import entites.Pen;

public class PenCompany {

	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			List<Pen> penlist=new ArrayList<>();
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Add pens/n 2. List all pens/n 3.Update stocks/n 4.Apply discount/n"
						+ "5.Remove unsold pens/n 0.exits ");
				System.out.println("Enter the choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the details - Bname, color, inkColor, material, stock, SUpdateDate, "
							+ "SListingDate, price, discount");
					Pen pen=addPen(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
					penlist.add(pen);
					break;
				case 2:
					System.out.println("Display all pens : ");
					for(Pen p: penlist)
						System.out.println(p);
					break;
				case 3: 
					System.out.println("Enter the pen id,stock : ");
					String mesg=StockUpdate(sc.nextInt(),sc.nextInt(), penlist);
					System.out.println(mesg);	
					break;
				case 4:
					System.out.println("Discount add list is : ");
					System.out.println(AddDiscount(penlist));
					break;
				case 5:
					System.out.println("Remove pens from list :");
					System.out.println(RemovePens(penlist));
					break;
				case 0:
					exit=true;
					
					
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
