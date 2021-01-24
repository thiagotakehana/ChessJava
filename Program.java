import Board.Board;

public class Program {
    public static void main(String[] args) {
        System.out.println("Starting chess board");

        Board board = new Board();
        board.InitializeBoard();
        board.PlotBoard();
        
        do {
            String input = System.console().readLine();

            int length = input.length();

            System.out.println(length);
            
            if(length != 8){
                System.out.println("Invalid movement");
                continue;
            }

            // Creating array of string length 
            char[] ch = new char[length]; 
    
            // Copy character by character into array 
            for (int i = 0; i < length; i++) { 
                ch[i] = input.charAt(i); 
            } 
            
            board.PlotBoard();
        } while (true);
    }
}