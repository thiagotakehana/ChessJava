package Board;

import java.util.ArrayList;
import java.util.List;
import Pieces.IChessPiece;
import Pieces.Enum.PieceColor;
import Pieces.*;

public class Board {
    private List<IChessPiece> Pieces;

    public Board() {
        super();
        Pieces = new ArrayList<IChessPiece>();
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

    public void PlotBoard(){
        for (int y = 8; y >= 1; y--) {
            String row = "";
            for (int x = 1; x <= 8; x++) {
                var piece = FindPieceByPosition(x, y);
                if(piece != null){
                    row = row.concat(piece.GetName() + " | ");
                }else{
                    row = row.concat("    | ");
                }                
            }
            System.out.println(row);
        }
    }

    public void InitializeBoard(){
        AddRooks();
        AddPawns();
        AddKings();
        AddQueens();
        AddBishops();
        AddKnights();
    }

    private void AddRooks(){
        Pieces.add(new Rook(1, 1, PieceColor.White));
        Pieces.add(new Rook(8, 1, PieceColor.White));
        Pieces.add(new Rook(8, 8, PieceColor.Black));
        Pieces.add(new Rook(1, 8, PieceColor.Black));
    }

    private void AddPawns(){
        for (int i = 1; i <= 8; i++) {
            Pieces.add(new Pawn(i, 2, PieceColor.White));
        }

        for (int i = 1; i <= 8; i++) {
            Pieces.add(new Pawn(i, 7, PieceColor.Black));
        }
    }

    private void AddKings(){
        Pieces.add(new King(5, 1, PieceColor.White));
        Pieces.add(new King(5, 8, PieceColor.Black));
    }

    private void AddQueens(){
        Pieces.add(new Queen(4, 1, PieceColor.White));
        Pieces.add(new Queen(4, 8, PieceColor.Black));
    }

    private void AddBishops(){
        Pieces.add(new Bishop(3, 1, PieceColor.White));
        Pieces.add(new Bishop(6, 1, PieceColor.White));
        Pieces.add(new Bishop(3, 8, PieceColor.Black));
        Pieces.add(new Bishop(6, 8, PieceColor.Black));
    }

    private void AddKnights(){
        Pieces.add(new Knight(2, 1, PieceColor.White));
        Pieces.add(new Knight(7, 1, PieceColor.White));
        Pieces.add(new Knight(2, 8, PieceColor.Black));
        Pieces.add(new Knight(7, 8, PieceColor.Black));
    }
}
