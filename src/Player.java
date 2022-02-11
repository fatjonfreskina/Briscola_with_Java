import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Player{
    private String name;
    private ArrayList<String> playerCards;
    private ArrayList<String> wonCards;        


    public Player(String inputName){
        this.name = inputName;
        playerCards = new ArrayList<String>();
        wonCards = new ArrayList<String>();
        System.out.println("Player " + inputName + " created");
    }

    public int getNumberOfWonCards(){
        return this.wonCards.size();
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

    public String randomThrowCard(){        //this is used by dumb pc
        int size = playerCards.size();
        int randomNum = ThreadLocalRandom.current().nextInt(size);
        String tmpCard = playerCards.get(randomNum);
        this.playerCards.remove(tmpCard);
        return tmpCard;        
    }

    public String throwCard(){
        Scanner sc = new Scanner(System.in);
        String card = null;
        boolean done = false;
        while (!done){
            System.out.printf("Choose a card to throw: " + this.playerCards + "\n");
            System.out.println("Enter the card you want to throw: ");
            card = sc.nextLine();
            if (this.playerCards.contains(card)){
                this.playerCards.remove(card);
                sc.close();
                this.playerCards.remove(card);
                return card;
            }
        }
        sc.close();
        return card;   
    }
    public boolean hasCards(){
        return !this.playerCards.isEmpty();
    }

    /*public int getFinalScore(){
        must be something like:
        tot = 0    
        for element in list:
            tot += element.getCardScore()

    }*/
    
}




            
