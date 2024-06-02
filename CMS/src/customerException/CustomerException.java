package customerException;

public class CustomerException extends RuntimeException{
	
	public String mesg;

	public CustomerException(String mesg) {
		super(mesg);	
	}
	

}
