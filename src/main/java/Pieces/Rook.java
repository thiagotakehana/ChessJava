package src.main.java.Pieces;

import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class Rook extends BasePiece {

    public Rook(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        if(this.PosX != X && this.PosY != Y){
            throw new InvalidMovementException("Rook can't move on diagonal");
        }

        if(this.PosX == X && this.PosY == Y){
            throw new InvalidMovementException("Rook can't move to the same space");
        }

        super.Move(X, Y);
    }

    @Override
    public String GetName() {
        return "Ro" + GetColorName();
    }
}
