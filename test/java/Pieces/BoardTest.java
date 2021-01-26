package test.java.Pieces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.main.java.Board.Board;
import src.main.java.Pieces.Exception.InvalidMovementException;

public class BoardTest {
    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test
    public void Move_piece_to_same_color_piece_should_return_exception(){
        Assert.assertThrows(InvalidMovementException.class, () -> {
            board.Move(1, 1, 1, 2);
        });

        Assert.assertThrows(InvalidMovementException.class, () -> {
            board.Move(1, 1, 2, 1);
        });
    }
}
