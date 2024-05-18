package CandidateDAO;

import java.sql.SQLException;
import java.util.List;

import POJOClass.Candidate;

public interface CandidateDao {

	List<Candidate> getcandidatedetails() throws SQLException;
	String countVotes(int id) throws SQLException;
	List<Candidate> TwoHighestVoter() throws SQLException;
	String ShowPartyStatus(String partyName) throws SQLException;
}
