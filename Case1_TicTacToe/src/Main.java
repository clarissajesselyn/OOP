import java.util.*;
public class Main {
    public Main(){
        Player player1 = new Player ('O', 1);
        Player player2 = new Player ('X', 2);

        Board board = new Board();
        
        System.out.println("Tic Tac Toe Game");
        board.printBoard();
        
        Game game = new Game(board, player1, player2);
        game.playing();
    }
    public static void main(String[] args) {
        new Main();
    }
}