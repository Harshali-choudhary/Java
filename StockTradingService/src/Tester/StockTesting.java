package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static utils.util.*;
import Entites.Stock;

public class StockTesting {

	public static void main(String[] args)
	{
		List<Stock> Stocklist=new ArrayList<>();
		
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Add stock\n2.Display available stock\n3.Purchase stock\n4.Sell stock\n"
						+ "5.Sort by company name\n6.Update stock price\n7.Delete stock\n8.Search by stock name\n0.exit");
				System.out.println("Enter the choice : ");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter the stock details - Stockid, sname, companyname, price, closingdate, quantity");
					Stock s=addStock(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.nextInt(), Stocklist);
					Stocklist.add(s);
					System.out.println(s);
					break;
				case 2:
					System.out.println("The available stocks are : ");
					for(Stock s1: Stocklist)
					{
						System.out.println(s1);
					}
					break;
				case 3:
					System.out.println("Enter the stock id,quantity : ");
					Stock stock=purchaseStock(sc.next(),sc.nextInt() , Stocklist);
					System.out.println(stock);
					break;
				case 4:
					System.out.println("Enter the stock id,quantity : ");
					Stock stock1=sellStock(sc.next(),sc.nextInt() , Stocklist);
					System.out.println(stock1);
					break;
				case 5:
					Collections.sort(Stocklist,new SortByCompanyName());
					for(Stock st:Stocklist)
					{
						System.out.println(st);
					}
					break;
				case 6:
					System.out.println("Enter the stock id and price : ");
					System.out.println(updatePrice(sc.next(),sc.nextDouble(), Stocklist));
					break;
				case 7:
					System.out.println("Enter the stock id :");
					System.out.println(deleteStock(sc.next(), Stocklist));
					break;
				case 8:
					System.out.println("Enter the stock name : ");
					System.out.println(SearchByName(sc.next(), Stocklist));
					break;
				case 0:
					System.out.println("Thank you visit again...");
					break;
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
