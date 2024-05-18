package POJOClass;

public class Candidate {

	private  int VoterId;
	private String Name;
	private String PartyName;
	private int voters;
	//private static int counter =1;
	
	public Candidate()
	{
		
	}
	

	public Candidate(int voterId, String name, String partyName, int voters) {
		super();
		VoterId = voterId;
		Name = name;
		PartyName = partyName;
		this.voters = voters;
	}


	public Candidate(String name, String partyName, int voters) {
		super();
		//VoterId = counter++; 
		Name = name;
		PartyName = partyName;
		this.voters = voters;
	}

	public Candidate(String partyName, int voters) {
      
		this.PartyName = PartyName;
		this.voters = voters;
	}


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPartyName() {
		return PartyName;
	}

	public void setPartyName(String partyName) {
		PartyName = partyName;
	}

	public int getVoters() {
		return voters;
	}

	public void setVoters(int voters) {
		this.voters = voters;
	}

	@Override
	public String toString() {
		return "Candidate [VoterId=" + VoterId + ", Name=" + Name + ", PartyName=" + PartyName + ", voters=" + voters
				+ "]";
	}
	
	
}
