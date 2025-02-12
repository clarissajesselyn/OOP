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
            do {
                System.out.println("Player " + numPlayer + " move " + "(" + player + "): ");
                x = sc.nextInt();
                y = sc.nextInt();
            } while ((x < 0 || x > 2 || y < 0 || y > 2) && board[y][x]!='-');
            board[y][x] = player;
            printBoard();
            step++;
            char win = checkWinner();
            if (win != '-'){
                System.out.println("Player " + win +" wins");
                break;
            } else if (step == 9){
                System.out.println("It's Draw!!");
                break;
            }
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
    public char checkWinner(){
        String[] check = new String [8];
        check[0] = Character.toString(board[0][0]) + Character.toString(board[1][0]) + Character.toString(board[2][0]); //horizontal
        check[1] = Character.toString(board[0][1]) + Character.toString(board[1][1]) + Character.toString(board[2][1]);
        check[2] = Character.toString(board[0][2]) + Character.toString(board[1][2]) + Character.toString(board[2][2]);
        check[3] = Character.toString(board[0][0]) + Character.toString(board[1][1]) + Character.toString(board[2][2]); //diagonal
        check[4] = Character.toString(board[2][0]) + Character.toString(board[1][1]) + Character.toString(board[0][2]);
        check[5] = Character.toString(board[0][0]) + Character.toString(board[0][1]) + Character.toString(board[0][2]); //vertical
        check[6] = Character.toString(board[1][0]) + Character.toString(board[1][1]) + Character.toString(board[1][2]); 
        check[7] = Character.toString(board[2][0]) + Character.toString(board[2][1]) + Character.toString(board[2][2]);

        for (int i = 0; i<8; i++){
            if (check[i].equals("XXX")){
                return 'X';
            } else if(check[i].equals("OOO")) {
                return 'O';
            }
        }
        return '-';
    }

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
