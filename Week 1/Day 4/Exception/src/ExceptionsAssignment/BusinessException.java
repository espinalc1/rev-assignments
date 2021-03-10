package ExceptionsAssignment;

public class BusinessException extends RuntimeException{
	public String message;

	public BusinessException(final String message) {
		super();
		this.message = message;
	}
	
}
