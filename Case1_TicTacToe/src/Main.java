import java.util.*;
public class Main {
    public Scanner sc;
    char [][] board = new char[3][3];
    char player = 'O';
    int numPlayer = 1;

    public Main(){
        sc = new Scanner (System.in);
        System.out.println("Tic Tac Toe Game");

        System.out.println("Board :");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                board[i][j] = '-';
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

        int x, y;
        int step = 0;
        do {
            //Input Coordinat to Play
            do {
                System.out.print("Player " + numPlayer + " move " + "(" + player + "): ");
                x = sc.nextInt();
                y = sc.nextInt();
            } while (x < 0 || x > 2 || y < 0 || y > 2 || board[y][x]!='-');
            board[y][x] = player;
            printBoard();
            step++;

            //Check Winner
            if (checkWinner(player)){
                System.out.println("Player " + player +" Win!!");
                break;
            } else if (step == 9){
                System.out.println("It's Draw!!");
                break;
            }

            //Switch Player
            if (player == 'O'){
                player = 'X';
                numPlayer = 2;
            } else {
                player = 'O';
                numPlayer = 1;
            }
        } while (true);
    }

    public void printBoard(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
    public boolean checkWinner(char play){
        for (int i = 0; i<3; i++){
            //Horizontal & Vertical
            if ((board[i][0] == play && board[i][1] == play && board[i][2] == play) || (board[0][i] == play && board[1][i] == play && board[2][i] == play)) {
                return true;
            }
        }

        //Diagonal
        if ((board[0][0] == play && board[1][1] == play && board[2][2] == play) || (board[2][0] == play && board[1][1] == play && board[0][2] == play)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
