package Fruit;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] farr = new Fruit[3];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		int ch;

		do {
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange ");
			System.out.println("3. Add Apple");
			System.out.println("4. Display Basket");
			System.out.println("5. Fresh Or Not");
			System.out.println("6. list Sour Fruit");
			System.out.println("7. display Specific functionality");
			System.out.println("Enter choice : ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				farr[i] = new Mango();
				farrayUtility.acceptdetails(farr, i);
				i++;
				break;
			case 2:
				farr[i] = new Orange();
				farrayUtility.acceptdetails(farr, i);
				i++;
				break;
			case 3:
				farr[i] = new Apple();
				farrayUtility.acceptdetails(farr, i);
				i++;
				break;
			case 4:
				farrayUtility.displaydetails(farr);
				
				break;
			case 5:
				farrayUtility.FreshOrNot(farr);
				break;
			case 6:
				farrayUtility.listSourFruit(farr);
				break;
			case 7:
				farrayUtility.displaySpecificfunctionality(farr);
			}

		} while (ch != 9);

	}

}
