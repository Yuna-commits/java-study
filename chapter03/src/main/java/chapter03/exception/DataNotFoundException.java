package chapter03.exception;

public class DataNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException(String message) {
		super(message);
	}
	
	public DataNotFoundException() {
		super("Data Not Found Exception Occured");
	}
}
