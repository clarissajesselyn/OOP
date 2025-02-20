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
            System.out.print("Player " + player.getNumPlayer() + " move " + "(" + player.getCharPlay() + "): ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (x < 0 || x > 2 || y < 0 || y > 2 || board.getBoardFill(x, y) != '-');
        board.setBoard(x, y, player.getCharPlay());
        board.printBoard();
        step++;
        
        if (board.checkWinner(player.getCharPlay())){
            System.out.println ("Player " + player.getNumPlayer() + " (" + player.getCharPlay() + ") " + "WIN!!");
            return true;
        } else if (step == 9){
            System.out.println ("It's Draw!!");
            return true;
        }
        return false;
    }
}
