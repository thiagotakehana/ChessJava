package Board.Exception;

public class PieceNotFoundException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public PieceNotFoundException(String ErrorMessage) {
        super(ErrorMessage);
    }

    public PieceNotFoundException() {
        super();
    }
}
