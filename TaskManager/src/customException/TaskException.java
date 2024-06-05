package customException;

public class TaskException extends RuntimeException{

	public TaskException(String mesg) {
		super(mesg);
	}
}
