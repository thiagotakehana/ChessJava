package src.main.java.Pieces;

import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class King extends BasePiece {

    public King(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String GetName() {
        return "Ki" + GetColorName();
    }
}
