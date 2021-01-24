package Pieces;

import Pieces.Enum.PieceColor;
import Pieces.Exception.InvalidMovementException;

public interface IChessPiece {
    
    public int GetPosX();
    public int GetPosY();
    public boolean isDead();
    public void PrintPosition();
    public void Move(int X, int Y) throws InvalidMovementException;
    public void Kill();
    public String GetName();
    public PieceColor GetColor();
    public String GetColorName();
}