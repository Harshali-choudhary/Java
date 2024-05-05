package Fruit;

import java.util.Scanner;

public class farrayUtility {

	public static void acceptdetails(Fruit farr[], int i) {

		if (farr[i] != null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name : ");
			farr[i].setname(sc.next());
			System.out.println("Enter weight : ");
			farr[i].setWeight(sc.nextDouble());
			System.out.println("Enter color : ");
			farr[i].setColor(sc.next());
			System.out.println("Enter the fruit is fresh and stale : ");
			farr[i].setFresh(sc.next());
		} else {
			System.out.println("Error: Fruit object is null");
		}

	}

	public static void displaydetails(Fruit[] farr) {
		for (int i = 0; i < farr.length; i++) {
			if (farr[i] != null) {
				System.out.println("Name : " + farr[i].getname());
				System.out.println("Weight : " + farr[i].getWeight());
				System.out.println("Color : " + farr[i].getColor());
				System.out.println("fruit is fresh and stale (true or false) : " + farr[i].isFresh());
			}

		}
	}

	public static void FreshOrNot(Fruit[] farr) {
		int index=0;
		for(Fruit f : farr)
		{
				
				if(f.isFresh().equals("fresh"))
				{
					System.out.println("Fruit is fresh "+farr[index].toString());
				}
				
			index++;
			
		}
	}

	public static void listSourFruit(Fruit[] farr) {
		int index =0;
		for (Fruit f :farr) {
			if(f.taste().equals("Sour"))
			{
				f.setFreshness("Stale");
				System.out.println("Sour fruit is stale"+farr[index].toString());
			}
			index++;
		}
	}

	public static void displaySpecificfunctionality(Fruit[] farr) {
		for (int i = 0; i < farr.length; i++) {
			if (farr[i] instanceof Mango) {
				Mango m = (Mango) farr[i];

				m.taste();
				m.Pulp();
			}
			if (farr[i] instanceof Orange) {
				Orange o = (Orange) farr[i];

				o.taste();
				o.Juice();
			}
			if (farr[i] instanceof Apple) {
				Apple a = (Apple) farr[i];

				a.taste();
				a.Jam();
			}
		}
	}

}
