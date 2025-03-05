import java.util.*;
public class Game{
    public Board board;
    public Player player1;
    public Player player2;

    public int step = 0;
    
    public Game(Board board, Player player1, Player player2){
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playing(){
       do {
            player1.move(board);
            step++;
            if (board.checkWinner(player1.getCharPlay()) || step == 9){
                System.out.println ("Player " + player1.getNumPlayer() + " (" + player1.getCharPlay() + ") " + "WIN!!");
                break;
            }
            player2.move(board);
            step++;
            if (board.checkWinner(player2.getCharPlay()) || step == 9){
                System.out.println ("Player " + player2.getNumPlayer() + " (" + player2.getCharPlay() + ") " + "WIN!!");
                break;
            }
        } while (true);
        
        if (step == 9){
            System.out.println ("It's Draw!!");
        }
    }
}

