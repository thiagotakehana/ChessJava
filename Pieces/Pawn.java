package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public class Pawn extends BasePiece {

    public Pawn(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        if(this.PosY != Y){
            throw new InvalidMovementException();
        }
    }

    @Override
    public String GetName() {
        return "Pa" + GetColorName();
    }
}