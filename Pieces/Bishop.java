package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public class Bishop extends BasePiece {

    public Bishop(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        // TODO Auto-generated method stub

    }

    @Override
    public String GetName() {
        return "Bi" + GetColorName();
    }
}