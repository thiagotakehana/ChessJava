package src.main.java.Pieces;

import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class Pawn extends BasePiece {

    public Pawn(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        boolean isFirstMove = false;

        if(this.PosX == X && this.PosY == Y){
            throw new InvalidMovementException("Pawn can't move to the same space");
        }

        if(this.Color == PieceColor.White){
            if(this.PosY == 2){
                isFirstMove = true;
            }
            
            if(Y - this.PosY < 1){
                throw new InvalidMovementException("Pawn can't move backwards");
            }
        }else{
            if(this.PosY == 7){
                isFirstMove = true;
            }

            if(this.PosY - Y < 1){
                throw new InvalidMovementException("Pawn can't move backwards");
            }
        }

        int movePositionsY = Math.abs(this.PosY - Y);

        if(movePositionsY > 2){
            throw new InvalidMovementException("Pawn can't move more than 2 houses");
        }

        if(movePositionsY == 2 && !isFirstMove){
            throw new InvalidMovementException("Pawn can't move 2 houses after first move");
        }

        int movePositionsX = Math.abs(this.PosX - X);

        if(movePositionsX > 1){
            throw new InvalidMovementException("Pawn can't move 2 houses on diagonal");
        }

        if(movePositionsX == 1 && movePositionsY > 1){
            throw new InvalidMovementException("Pawn can't move 2 houses and 1 in diagonal");
        }

        if(this.PosY == Y){
            throw new InvalidMovementException("Pawn should move fowards");
        }

        super.Move(X, Y);
    }

    @Override
    public String GetName() {
        return "Pa" + GetColorName();
    }
}