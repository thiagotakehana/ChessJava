package src.main.java.Board;

import java.util.ArrayList;
import java.util.List;

import src.main.java.Pieces.Bishop;
import src.main.java.Pieces.IChessPiece;
import src.main.java.Pieces.King;
import src.main.java.Pieces.Knight;
import src.main.java.Pieces.Pawn;
import src.main.java.Pieces.Queen;
import src.main.java.Pieces.Rook;
import src.main.java.Pieces.Enum.PieceColor;

public class BoardInitializer {
    private List<IChessPiece> Pieces;

    public List<IChessPiece> InitializeBoard(){
        this.Pieces = new ArrayList<IChessPiece>();
        AddRooks();
        AddPawns();
        AddKings();
        AddQueens();
        AddBishops();
        AddKnights();
        return Pieces;
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
