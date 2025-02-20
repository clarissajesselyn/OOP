public class Player {
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
}
