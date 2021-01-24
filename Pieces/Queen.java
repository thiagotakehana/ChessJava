package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public class Queen extends BasePiece {

    public Queen(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        

    }

    @Override
    public String GetName() {
        return "Qu" + GetColorName();
    }
}
