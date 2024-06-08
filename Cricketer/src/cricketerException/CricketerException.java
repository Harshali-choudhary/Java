package cricketerException;

public class CricketerException extends Exception {

	private String mesg;
	 
	public CricketerException(String mesg) {
		this.mesg=mesg;
	}
}
