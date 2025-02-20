public class Board{
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

    public char getBoardFill(int x, int y){
        return board[y][x];
    }

    public boolean checkWinner(char play){
        for (int i = 0; i<3; i++){
            // Horizontal & Vertical
            if ((board[i][0] == play && board[i][1] == play && board[i][2] == play) 
             || (board[0][i] == play && board[1][i] == play && board[2][i] == play)) {
                return true;
            }
        }
    
        // Diagonal
        if ((board[0][0] == play && board[1][1] == play && board[2][2] == play)
         || (board[2][0] == play && board[1][1] == play && board[0][2] == play)){
            return true;
        }
        return false;
    }
}