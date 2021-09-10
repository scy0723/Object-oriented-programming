package °´Áölab9;

public class NegativeException extends Exception{
	public NegativeException() {
		super("Work time must be positive");
	}
	public NegativeException(String message) {
		super(message);
	}
}
