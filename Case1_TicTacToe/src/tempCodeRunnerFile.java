import java.util.*;

class Player{
    public char play;
    public int numPlayer;
    public Player (char play, int numPlayer){
        this.play = play;
        this.numPlayer = numPlayer;
    }
}

class Board{
    public char [][] board = new char[3][3];
    public Board(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
    }
    public void printBoard(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public void setBoard(int x, int y, char play){
        board[y][x] = play;
    }
    public boolean checkBoard(int x, int y, char check){
        if (board[y][x] == check){
            return true;
        } else {
            return false;
        }
    }
}

class Game{
    public Scanner sc;
    public Player player1;
    public Player player2;
    public Board board;
    
    public Game(Player player1, Player player2, Board board){
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }
    public boolean Playing(Player player){
        sc = new Scanner (System.in);
        int step = 0;
        int x, y;

        do {
            System.out.print("Player " + player.numPlayer + " move " + "(" + player.play + "): ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (x < 0 || x > 2 || y < 0 || y > 2 || !board.checkBoard(x, y, '-'));
        board.setBoard(x, y, player.play);
        board.printBoard();
        step++;
        
        if (checkWinner(player.play)){
            System.out.println ("Player " + player.numPlayer + " (" + player.play + ") " + "WIN!!");
            return true;
        } else if (step == 9){
            System.out.println ("It's Draw!!");
            return true;
        }
        return false;
    }

    public boolean checkWinner(char play){
        for (int i = 0; i<3; i++){
            // Horizontal & Vertical
            if ((board.checkBoard(i, 0, play) && board.checkBoard(i, 1, play) && board.checkBoard(i, 2, play)) 
             || (board.checkBoard(0, i, play) && board.checkBoard(1, i, play) && board.checkBoard(2, i, play))) {
                return true;
            }
        }
    
        // Diagonal
        if ((board.checkBoard(0, 0, play) && board.checkBoard(1, 1, play) && board.checkBoard(2, 2, play))
         || (board.checkBoard(2, 0, play) && board.checkBoard(1, 1, play) && board.checkBoard(0, 2, play))){
            return true;
        }
    
        return false;
    }
}

public class Main {
   
    Player player1 = new Player ('O', 1);
    Player player2 = new Player ('X', 2);

    Board board = new Board();

    public Main(){
        System.out.println("Tic Tac Toe Game");
        board.printBoard();
        Game game = new Game(player1, player2, board);
        
        do {
            if (game.Playing(player1)) break;
            else if (game.Playing(player2)) break;
        } while (true);
    }

    

    public static void main(String[] args) throws Exception {
        new Main();
    }
}