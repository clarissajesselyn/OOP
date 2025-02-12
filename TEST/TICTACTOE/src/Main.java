import java.util.*;
public class Main {
    public Scanner sc;
    char[][] board = new char[3][3];
    char player = 'O';
    int players = 1;

    public Main() {
        sc = new Scanner (System.in);
        System.out.println("Tic Tac Toe Game :");

        System.out.println ("Board: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board [i][j] = '-';
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        int x, y;
        int step = 0;
        char win;
        do {
            do {
                System.out.print("Player " + players + " move (" + player+") :");
                x = sc.nextInt();
                y = sc.nextInt();
            } while ((x<0 || x>2 || y<0 || y>2) || board[y][x]!='-');
            board[y][x] = player;
            printBoard();
            win = checkWinner();
            if (win == player) {
                if (win == 'X') {
                    System.out.println ("The Winner is Player 2 ("+ win + ")");
                } else {
                    System.out.println ("The Winner is Player 1 ("+ win + ")");
                }
                break;
            }
            step++;

            if (player == 'O' && players == 1){
                player = 'X';
                players = 2;
            } else if (player == 'X' && players == 2){
                player = 'O';
                players = 1;
            }
        } while (win=='0' && step < 9);

        if (step == 9 && win == '0') {
            System.out.println("It's a draw!");
        }
    }
    public char checkWinner(){
        String[] line = new String [8]; //for validation
        line[0] = Character.toString(board[0][0]) + Character.toString(board [1][0]) + Character.toString(board [2][0]); //horizontal
        line[1] = Character.toString(board[0][1]) + Character.toString(board [1][1]) + Character.toString(board [2][1]);
        line[2] = Character.toString(board[0][2]) + Character.toString(board [1][2]) + Character.toString(board[2][2]);
        line[3] = Character.toString(board[0][0]) + Character.toString(board [1][1]) + Character.toString(board[2][2]); //diagonal
        line[4] = Character.toString(board[2][0]) + Character.toString(board [1][1]) + Character.toString(board[0][2]);
        line[5] = Character.toString(board[0][0]) + Character.toString(board [0][1]) + Character.toString(board [0][2]); //vertical
        line[6] = Character.toString(board[1][0]) + Character.toString(board [1][1]) + Character.toString(board [1][2]);
        line[7] = Character.toString(board[2][0]) + Character.toString(board [2][1]) + Character.toString(board[2][2]);

        for (int i = 0; i<8; i++){
            if (line[i].equals("XXX")) {
                return 'X';
            } else if (line[i].equals("OOO")){
                return 'O';
            }
        }
        return '0';
    }
    public void printBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Main();
    }

}
