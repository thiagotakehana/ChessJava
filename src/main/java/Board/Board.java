package src.main.java.Board;

import java.util.List;

import src.main.java.Board.Exception.PieceNotFoundException;
import src.main.java.Pieces.IChessPiece;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class Board {
    private List<IChessPiece> Pieces;

    public Board() {
        super();
        Pieces = new BoardInitializer().InitializeBoard();
    }

    public void PrintBoard(){
        for (IChessPiece iChessPiece : Pieces) {
            iChessPiece.PrintPosition();
        }
    }

    private IChessPiece FindPieceByPosition(int X, int Y){
        for (IChessPiece iChessPiece : Pieces) {
            if(iChessPiece.GetPosX() == X && iChessPiece.GetPosY() == Y){
                return iChessPiece;
            }
        }

        return null;
    }

    public void Move(int OldX, int OldY, int NewX, int NewY) throws InvalidMovementException, PieceNotFoundException {
        IChessPiece foundedPiece = FindPieceByPosition(OldX, OldY);
        IChessPiece destinationPiece = FindPieceByPosition(NewX, NewY);

        if(foundedPiece == null){
            throw new PieceNotFoundException("Piece not found");
        }
        
        boolean isEatMovement = false;
        if(destinationPiece != null){
            isEatMovement = true;
        }

        if(isEatMovement && foundedPiece.GetColor() == destinationPiece.GetColor()){
            throw new InvalidMovementException("Piece can't eat piece same color");
        }

        try {
            foundedPiece.Move(NewX, NewY);
        } catch (InvalidMovementException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void PlotBoard(){
        for (int y = 8; y >= 1; y--) {
            String row = "";
            for (int x = 1; x <= 8; x++) {
                var piece = FindPieceByPosition(x, y);
                if(piece != null && !piece.isDead()){
                    row = row.concat(piece.GetName() + " | ");
                }else{
                    row = row.concat("    | ");
                }                
            }
            System.out.println(row);
        }
    }
    
}
