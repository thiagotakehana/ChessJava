package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public class King extends BasePiece {

    public King(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
    }

    @Override
    public String GetName() {
        return "Ki" + GetColorName();
    }
}
