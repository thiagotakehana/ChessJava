import src.main.java.Board.Board;

public class Program {
    public static void main(String[] args) {
        ClearConsole();
        PrintLine("Starting chess board");

        Board board = new Board();
        board.InitializeBoard();
        
        do {
            System.out.println("Type movement on format e2 e4 or type P to print board");
            String input = System.console().readLine().trim().toLowerCase();

            int length = input.length();
            
            if(length == 1){
                ClearConsole();
                board.PlotBoard();
                continue;
            }

            if(length != 5){
                ClearConsole();
                PrintLine("Invalid movement");
                continue;
            }
   
            try {
                int OldX = input.charAt(0) - 96;
                int OldY = Character.getNumericValue(input.charAt(1));
                int NewX = input.charAt(3) - 96;
                int NewY = Character.getNumericValue(input.charAt(4));
                board.Move(OldX, OldY, NewX, NewY);
            } catch (Exception e) {
                ClearConsole();
                PrintLine(e.getMessage());
                continue;
            }
            
            ClearConsole();
            board.PlotBoard();
        } while (true);
    }

    private static void PrintLine(String Message){
        System.out.println(Message);
    }

    private static void ClearConsole(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}