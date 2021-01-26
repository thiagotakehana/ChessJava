package src.main.java.Pieces;

import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public abstract class BasePiece implements IChessPiece {

    int PosX;
    int PosY;
    boolean Dead;
    PieceColor Color;

    public BasePiece(int X, int Y, PieceColor Color) {
        super();
        this.SetPosition(X, Y);
        this.SetColor(Color);
    }

    private void SetColor(PieceColor Color){
        this.Color = Color;
    }

    private void SetPosition(int X, int Y){
        this.PosX = X;
        this.PosY = Y;
    }

    @Override
    public int GetPosX() {
        return this.PosX;
    }

    @Override
    public int GetPosY() {
        return this.PosY;
    }

    @Override
    public void PrintPosition() {
        System.out.print("X:");
        System.out.print(this.PosX);
        System.out.print(" Y:");
        System.out.println(this.PosY);
    }

    @Override
    public void Move(int X, int Y) throws InvalidMovementException {
        this.SetPosition(X, Y);
    }

    @Override
    public boolean isDead() {
        return this.Dead;
    }

    @Override
    public void Kill(){
        this.Dead = true;
    }

    @Override
    public PieceColor GetColor(){
        return this.Color;
    }

    @Override
    public String GetColorName(){
        if(this.Color == PieceColor.White)
            return "*";
        else
            return " ";
    }
}