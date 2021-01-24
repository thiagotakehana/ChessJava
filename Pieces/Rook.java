package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public class Rook extends BasePiece {

    public Rook(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        // TODO Auto-generated method stub

    }

    @Override
    public String GetName() {
        return "Ro" + GetColorName();
    }
}
