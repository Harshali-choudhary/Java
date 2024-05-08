package CMSException;

@SuppressWarnings("serial")
public class CMSException extends Exception{
	
	private String mesg;
	
	public CMSException(String msg)
	{
		mesg=msg;
	}
	
	@Override
	public String toString()
	{
		return "CMS Exception is : "+mesg;
	}

}
