package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public class Pawn extends BasePiece {

    public Pawn(int X, int Y, PieceColor Color) {
        super(X, Y, Color);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        boolean isFirstMove = false;

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

        int movePositions = Math.abs(this.PosY - Y);

        if(movePositions > 2){
            throw new InvalidMovementException("Pawn can't move more than 2 houses");
        }

        if(movePositions == 2 && !isFirstMove){
            throw new InvalidMovementException("Pawn can't move 2 houses after first move");
        }

        super.Move(X, Y);
    }

    @Override
    public String GetName() {
        return "Pa" + GetColorName();
    }
}