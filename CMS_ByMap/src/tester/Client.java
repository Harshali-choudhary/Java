package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import CustomOrdering.customOrderingbyDobAndLastname;
import Customer.customer;
import VAlidationRules.validationRules;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Try with resources
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;

			Map<String, customer> Customer = new HashMap<>();

			while (!exit) {
				try {
					System.out.println("1.Signup\n 2.Signin\n 3.Change password\n"
							+ " 4.Remove Un subscribe customer\n 5.Display all customer\n 6.Sort by natural ordering\n 7.Sort by Custom ordering \n8.Exit");
					System.out.println("Enter the choice : ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter the firstname,lastname,email,password,registration amt,date,service plan");
						customer c1 = validationRules.validateInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), Customer);
						Customer.put(c1.getEmail(), c1);
						System.out.println("Account created..");
						break;
					case 2:
						System.out.println("Enter the email and password : ");
						validationRules.validateSignin(sc.next(), sc.next(), Customer);
						break;
					case 3:
						System.out.println("Enter the email and password : ");
						customer c = validationRules.validateSignin(sc.next(), sc.next(), Customer);
						System.out.println("Enter the new password : ");
						c.setPassword(sc.next());
						System.out.println("New password is created.");

						break;
					case 4:
						System.out.println("Remove unsubscribe customer ");
						System.out.println("Enter the email");
						String cus = validationRules.deletecustomer(sc.next(), Customer);
						System.out.println("Remove customer is : " + cus);
						break;
					case 5:
						System.out.println("All Details of customer ");
						for (customer cust : Customer.values())
							System.out.println(cust);
						break;
					case 6:
						TreeMap<String, customer> sortedAcctMap = new TreeMap<>(Customer);
						for (customer cust : sortedAcctMap.values())
							System.out.println(cust);
						break;
					case 7:
						LinkedList<customer> list = new LinkedList<>(Customer.values());
						for (customer cust : list)
							System.out.println(cust);
						break;
					case 8:
						exit = true;
						break;
					}
				}

				catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}

	}
}
