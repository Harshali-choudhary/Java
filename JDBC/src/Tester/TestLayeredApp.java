package Tester;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CandidateDAO.CandidateDao;
import CandidateDAO.CandidateDaoImpl;
import POJOClass.Candidate;
import POJOClass.User;
import UserDao.UserDaoImpl;
import UserDao.userDao;

import static CandidateDAO.CandidateDaoImpl.*;

public class TestLayeredApp {

	public static void main(String[] args) throws SQLException {
	    CandidateDaoImpl cd=new CandidateDaoImpl();
	    UserDaoImpl ud = new UserDaoImpl();
		try(Scanner sc = new Scanner(System.in))
		{
			Boolean exit = false;
			while(!exit)
			{
				try {
				System.out.println("Options\n 1.Login User\n  2.Reset password \n"
						+"3. Registration \n 4. Get user details \n 5.Delete user from list\n"
						+ "6.Display all candidates \n 7. Increment candidate's votes\n"
						+ "8.Highest votes candidates\n 9.Show Votes by partywise \n 0.Exit ");
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("Enter the email and password : ");
					User user = ud.Loginin(sc.next(), sc.next());
					if(user != null)
					{
						System.out.println("Login Successful");
					System.out.println(user);
					}
					else
						System.out.println("Invalid Email and password!!");
					break;
				case 2:
					System.out.println("Enter the email,old password and new password : ");
					System.out.println(ud.UpdatePassword(sc.next(), sc.next(), sc.next()));
					
					break;
				case 3:
					System.out.println("Enter Voter's details - firstName,  lastName, email,  password,  dob");
					
					user = new User(sc.next(),sc.next(),sc.next(),sc.next(),Date.valueOf(sc.next()));
					System.out.println("Reg status " + ud.Registration(user));
					break;
				case 4:
					System.out.println("Enter start n end DoBs(yr-mon-day)");
					List<User> list = ud.getuserDetails(Date.valueOf(sc.next()), Date.valueOf(sc.next()));
					System.out.println("Users -");
					list.forEach(System.out::println);
					break;
				case 5:
					System.out.println("Enter the id : ");
					System.out.println(ud.DeleteVoterFromList(sc.nextInt()));
					
					break;
				case 6 :
					System.out.println("Display All candidates details ");
					List<Candidate> lst;
					
						lst = cd.getcandidatedetails();
					 
					lst.forEach(s1->System.out.println(s1));
					break;
				case 7 :
					System.out.println("Enter the voter id : ");
					System.out.println(ud.updateVotingStatus(sc.nextInt()));
					List<Candidate> list1;	
					list1 = cd.getcandidatedetails();
				    list1.forEach(s2->System.out.println(s2));
					System.out.println("Enter the candidate id :");
					System.out.println(cd.countVotes(sc.nextInt()));
					
					break;
				case 8 :
					System.out.println("The two highest votes candidates is :  ");
					List<Candidate> lst1;
					lst1 = cd.TwoHighestVoter();
					lst1.forEach(s->System.out.println(s));
					break;
				case 9 :System.out.println("Show the partywise candidate and votes");
				System.out.println("Enter the party name : ");
				String candidate = cd.ShowPartyStatus(sc.next());
				System.out.println("Party name and total votes of that party : "+candidate);
				break;
				case 0:
					exit=true;
					
				}
			}
				catch(Exception e)
				{
					e.printStackTrace();
					sc.nextLine();
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
