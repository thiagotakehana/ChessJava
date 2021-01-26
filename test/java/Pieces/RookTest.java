package test.java.Pieces;

import org.junit.Assert;
import org.junit.Test;

import src.main.java.Pieces.Rook;
import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class RookTest {
    private Rook whiteRook;
    private Rook blackRook;

    public RookTest() {
        whiteRook = new Rook(1, 1, PieceColor.White);
        blackRook = new Rook(1, 8, PieceColor.Black);
    }

    @Test
    public void Move_same_place_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            whiteRook.Move(1, 1);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            blackRook.Move(1, 8);
        });
    }

    @Test
    public void Move_diagonal_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            whiteRook.Move(2, 2);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            whiteRook.Move(2, 3);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            blackRook.Move(2, 7);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            blackRook.Move(3, 6);
        });
    }
}