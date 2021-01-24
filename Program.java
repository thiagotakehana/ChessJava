import Board.Board;

public class Program {
    public static void main(String[] args) {
        System.out.println("Starting chess board");

        Board board = new Board();
        board.InitializeBoard();
        board.PlotBoard();
    }
}