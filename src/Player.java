import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Player{
    ArrayList<String> playerCards;                              //class attribute, cards the player can play
    ArrayList<String> wonCards;                                 //cards the player won 


    public Player(){
        playerCards = new ArrayList<String>();
        wonCards = new ArrayList<String>();
        System.out.println("Player created");
    }

    public void addToWonCards(String card1, String card2){        
        this.wonCards.add(card1);
        this.wonCards.add(card2);
    }

    public void addCard(String tmpCard){
        playerCards.add(tmpCard);
        //System.out.println("Card added to players deck");
    }

    public void dispPlayerCard(){
        System.out.println(this.playerCards);
    }

    public String throwCard(){
        int size = playerCards.size();
        int randomNum = ThreadLocalRandom.current().nextInt(1, size);
        String tmpCard = playerCards.get(randomNum);
        this.playerCards.remove(randomNum);
        return tmpCard;        
    }
}