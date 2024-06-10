package exception;

public class itemException extends Exception{

	private String mesg;
	
	public itemException(String  m)
	{
		this.mesg=m;
	}
}
