import java.util.*;
public class Game{
    public Scanner sc;
    public Board board;
    public int step = 0;
    
    public Game(Board board){
        this.board = board;
    }
    public boolean Playing(Player player){
        sc = new Scanner (System.in);
        int x, y;

        do {
            System.out.print("Player " + player.numPlayer + " move " + "(" + player.play + "): ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (x < 0 || x > 2 || y < 0 || y > 2 || !board.checkBoard(x, y, '-'));
        board.setBoard(x, y, player.play);
        board.printBoard();
        step++;
        
        if (board.checkWinner(player.play)){
            System.out.println ("Player " + player.numPlayer + " (" + player.play + ") " + "WIN!!");
            return true;
        } else if (step == 9){
            System.out.println ("It's Draw!!");
            return true;
        }
        return false;
    }
}
