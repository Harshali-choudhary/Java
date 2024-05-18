package UserDao;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import POJOClass.User;

public interface userDao {

	User Loginin(String email,String password) throws SQLException;
	
	String UpdatePassword(String email,String oldpassword,String newPassword) throws SQLException;

	String DeleteVoterFromList(int id) throws SQLException;
	
	List<User> getuserDetails(Date begin,Date end) throws SQLException;
	
	String Registration(User newUser) throws SQLException;
	
	String updateVotingStatus(int voterId) throws SQLException;
	
}
