package UserDao;

import java.sql.Connection;
import static DBUtils.DBUtils.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import POJOClass.User;

public class UserDaoImpl implements userDao {

	Connection cn;
	PreparedStatement pst1,pst2,pst3,pst4,pst5,pst6;
	public UserDaoImpl() throws SQLException
	{
		cn = openConnection();
		pst1=cn.prepareStatement("Select * from users where email=? and password= ?");
		pst2 = cn.prepareStatement("update users set password =? where email = ? and password =? and role = 'voter'");
		pst3 = cn.prepareStatement("delete from user where id = ?");
		pst4 = cn.prepareStatement("Select * from users where dob between ? and ?");
		pst5 = cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		pst6=cn.prepareStatement("update users set status=1 where id=?");
	}
	@Override
	public User Loginin(String email, String password) throws SQLException {
	
		pst1.setString(1, email);
		pst1.setString(2, password);
		try(ResultSet rst = pst1.executeQuery())
		{
			if(rst.next())
				return new User(rst.getInt(1),rst.getString(2),rst.getString(3),
						rst.getString(4),rst.getString(5),rst.getDate(6),rst.getBoolean(7)
						,rst.getString(8));	
		}
		return null;
	}

	@Override
	public String UpdatePassword(String email, String oldpassword, String newPassword) throws SQLException {
		pst2.setString(1, newPassword);
		pst2.setString(2, email);
		pst2.setString(3, oldpassword);
		int row = pst2.executeUpdate();
		if(row == 1)
			return "Password set successfully";
	
		return "Password not yet changed";
	}

	@Override
	public String DeleteVoterFromList(int id) throws SQLException {
		pst3.setInt(1, id);
		int rst = pst3.executeUpdate();
		if(rst == 1)
			return "User deleted successfully";
		
		return "User not deleted from voting list";
	}

	@Override
	public List<User> getuserDetails(Date begin, Date end) throws SQLException {
		pst4.setDate(1, begin);
		pst4.setDate(2, end);
		List<User> lst = new ArrayList<>();
		try(ResultSet rst = pst4.executeQuery())
		{
			while(rst.next())
			{
				 lst.add(new User(rst.getInt(1),rst.getString(2),rst.getString(3),
						rst.getString(4),rst.getString(5),rst.getDate(6),rst.getBoolean(7),rst.getString(8)));
			}
		}
		return lst;
	}

	@Override
	public String Registration(User newUser) throws SQLException {
		
		pst5.setInt(1, newUser.getId());
		pst5.setString(2, newUser.getFirst_name());
		pst5.setString(3, newUser.getLast_name());
		pst5.setString(4,newUser.getEmail());
		pst5.setString(5, newUser.getPassword());
		pst5.setDate(6, newUser.getDob());
		pst5.setBoolean(7, newUser.getStatus());
		pst5.setString(8, newUser.getRole());
		
		int row = pst5.executeUpdate();
		if(row ==1)
			return "Voter register successfully";
		return "Voter registration failed";
	}

	@Override
	public String updateVotingStatus(int voterId) throws SQLException {
		// set IN param
		pst6.setInt(1, voterId);
		//exec query : update
		int rows = pst6.executeUpdate();
		if(rows == 1)
			return "Voted Successfully !";
		return "Voting failed....";
	}
	
	public void clenup() throws SQLException
	{
		if(pst1 != null)
			 pst1.close();
		if(pst2 != null)
			pst2.close();
		if(pst3 != null)
			pst3.close();
		if(pst4 != null)
			pst4.close();
		if(pst5 != null)
			pst5.close();
		if(pst6 != null)
			pst6.close();
		closeConnection();
			
	}
}
