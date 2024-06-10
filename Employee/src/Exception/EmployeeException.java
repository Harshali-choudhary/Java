package Exception;

public class EmployeeException extends Exception{
	
	private String mesg;
	
	public EmployeeException(String mesg) {
		
		this.mesg=mesg;
	}

}
