package CustomException;

public class StockException extends Exception{

	private String mesg;
	
	public StockException(String mesg) {
		this.mesg=mesg;
	}
}
