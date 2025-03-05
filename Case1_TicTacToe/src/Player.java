import java.util.Scanner;

public class Player {
    public Scanner sc;
    public char play;
    public int numPlayer;
    public Player (char play, int numPlayer){
        this.play = play;
        this.numPlayer = numPlayer;
    }

    public char getCharPlay(){
        return play;
    }

    public int getNumPlayer (){
        return numPlayer;
    }

    public void move(Board board){
        int x, y;
        sc = new Scanner(System.in);
        do {
            System.out.print("Player " + numPlayer + " move " + "(" + play + "): ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (x < 0 || x > 2 || y < 0 || y > 2 || board.getBoardFill(x, y) != '-');
        board.setBoard(x, y, play);
        board.printBoard();
    }
}
