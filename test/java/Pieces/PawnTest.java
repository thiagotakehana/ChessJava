package test.java.Pieces;

import org.junit.Assert;
import org.junit.Test;

import src.main.java.Pieces.*;
import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class PawnTest {

    private Pawn whitePawn;
    private Pawn blackPawn;

    public PawnTest() {
        whitePawn = new Pawn(1, 2, PieceColor.White);
        blackPawn = new Pawn(1, 7, PieceColor.Black);
    }

    @Test
    public void Move_more_than_2_houses_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            whitePawn.Move(1, 5);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            blackPawn.Move(1, 4);
        });
    }

    @Test
    public void Move_backwards_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            whitePawn.Move(1, 1);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            blackPawn.Move(1, 8);
        });
    }

    @Test
    public void Move_diagonal_more_than_1_house_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            whitePawn.Move(3, 3);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            whitePawn.Move(2, 4);
        });
    }

    @Test
    public void Move_side_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            whitePawn.Move(1, 3);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            whitePawn.Move(1, 4);
        }); 
    }
}
