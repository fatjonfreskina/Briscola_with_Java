import java.util.*;

public class Player{
    ArrayList<String> playerCards; //class attribute

    public Player(){
        playerCards = new ArrayList<String>();
        System.out.println("Player created");
    }

    public void addCard(String tmpCard){
        playerCards.add(tmpCard);
        System.out.println("Card added to players deck");
    }

    public void dispPlayerCard(){
        System.out.println(this.playerCards);
    }
}