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

    public void pickCard(Mazzo mazzo){
        String card = mazzo.getCard();
        playerCards.add(card);
    }

    public void dispPlayerCard(){
        System.out.println(this.playerCards);
    }

    public String randomThrowCard(){        //this is used by the dumb pc
        int size = playerCards.size();
        int randomNum = ThreadLocalRandom.current().nextInt(1, size);
        String tmpCard = playerCards.get(randomNum);
        this.playerCards.remove(tmpCard);
        return tmpCard;        
    }

    public String throwCard(){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            System.out.printf("Choose a card to throw: " + this.playerCards + "\n");
            System.out.println("Enter the card you want to throw: ");
            String card = sc.next();
            System.out.printf("You choose: " + card + "\n");
            if (this.playerCards.contains(card)){
                this.playerCards.remove(card);
                
                break;
            }
        sc.close();
        return card;
    }
}

}

            
