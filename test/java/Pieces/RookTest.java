package test.java.Pieces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.main.java.Pieces.Rook;
import src.main.java.Pieces.Enum.PieceColor;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class RookTest {
    private Rook whiteRook;
    private Rook blackRook;

    @Before
    public void setUp() {
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

    @Test
    public void Move_forward_should_return_success(){

        try {
            whiteRook.Move(1, 5);
            blackRook.Move(1, 5);
        } catch (Exception e) {
            Assert.fail("Exception on move forward");
        }
        
        Assert.assertEquals(whiteRook.GetPosX(), 1);
        Assert.assertEquals(whiteRook.GetPosY(), 5);
        Assert.assertEquals(blackRook.GetPosX(), 1);
        Assert.assertEquals(blackRook.GetPosY(), 5);
    }

    @Test
    public void Move_side_should_return_success(){

        try {
            whiteRook.Move(5, 1);
            blackRook.Move(5, 8);
        } catch (Exception e) {
            Assert.fail("Exception on move forward");
        }
        
        Assert.assertEquals(whiteRook.GetPosX(), 5);
        Assert.assertEquals(whiteRook.GetPosY(), 1);
        Assert.assertEquals(blackRook.GetPosX(), 5);
        Assert.assertEquals(blackRook.GetPosY(), 8);
    }
}