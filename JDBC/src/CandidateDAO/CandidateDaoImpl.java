package CandidateDAO;

import DBUtils.DBUtils.*;
import POJOClass.Candidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static DBUtils.DBUtils.*;

public class CandidateDaoImpl implements CandidateDao {

	private Connection cn;
	private PreparedStatement pst1,pst2,pst3,pst4;

	public CandidateDaoImpl() throws SQLException {
		cn = openConnection();
		pst1 = cn.prepareStatement("Select * from candidates");
		pst2 = cn.prepareStatement("update candidates set votes = votes+1 where id = ?");
        pst3 = cn.prepareStatement("select * from candidates order by votes desc limit 2");
        pst4 = cn.prepareStatement("Select party,sum(votes) AS total_votes from candidates where party=? group by party");
        		
		System.out.println("Candidate Dao created...");
	}

	@Override
	public List<Candidate> getcandidatedetails() throws SQLException {
		List<Candidate> lst = new ArrayList<>();
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next()) {
				// String name, String partyName, int voters
				lst.add(new Candidate(rst.getInt(1),rst.getString(2), rst.getString(3), rst.getInt(4)));
			}
		}
		return lst;
	}
	
	public String countVotes(int id) throws SQLException
	{
		pst2.setInt(1, id);
		int row  = pst2.executeUpdate();
		if(row == 1)
			return "Votes increment successfully";
		return "Votes not increment yet successfully";
	}

	public List<Candidate> TwoHighestVoter() throws SQLException
	{
		List<Candidate> list = new ArrayList<>();
		try(ResultSet rst = pst3.executeQuery())
		{
			while(rst.next())
				list.add(new Candidate(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getInt(4)));
		}
		return list;
	}
	
	
	public  String ShowPartyStatus(String pname) throws SQLException
	{
		
		pst4.setString(1, pname);
		try(ResultSet rst = pst4.executeQuery()){
			while(rst.next())
			{
				String partyName = rst.getString(1);
				int total_votes = rst.getInt(2);
				return partyName+" "+total_votes;
			}
		}
		return null;
		
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
		closeConnection();
			
	}
}
