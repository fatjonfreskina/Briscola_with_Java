public class GameLoop{
    public boolean isRunning;

    public GameLoop(){
        this.isRunning = true;
        System.out.println("Game began");
    }

    public boolean checkGame(Mazzo mazzo){
        if (mazzo.hasCards() == (true)){
            return true;
        } else {
            return false;
        }
    }
}