package Pieces.Exception;

public class InvalidMovementException extends Exception {
	private static final long serialVersionUID = 3316861443982217667L;

	public InvalidMovementException(String ErrorMessage) {
        super(ErrorMessage);
    }

    public InvalidMovementException() {
        super("Invalid movement");
    }
}