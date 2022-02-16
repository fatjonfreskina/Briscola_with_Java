import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Mazzo{
    private ArrayList<String> cards;
    private HashMap<String,Integer> cardValue;
    //private String briscola;

    public Mazzo(){

        cardValue = new HashMap<String, Integer>();
        cards = new ArrayList<String>();

        cards.add("ASSO DI COPPE");
        cards.add("DUE DI COPPE");
        cards.add("TRE DI COPPE");
        cards.add("QUATTRO DI COPPE");
        cards.add("CINQUE DI COPPE");
        cards.add("SEI DI COPPE");
        cards.add("SETTE DI COPPE");
        cards.add("OTTO DI COPPE");
        cards.add("NOVE DI COPPE");
        cards.add("DIECI DI COPPE");

        cards.add("ASSO DI SPADE");
        cards.add("DUE DI SPADE");
        cards.add("TRE DI SPADE");
        cards.add("QUATTRO DI SPADE");
        cards.add("CINQUE DI SPADE");
        cards.add("SEI DI SPADE");
        cards.add("SETTE DI SPADE");
        cards.add("OTTO DI SPADE");
        cards.add("NOVE DI SPADE");
        cards.add("DIECI DI SPADE");

        cards.add("ASSO DI BASTONI");
        cards.add("DUE DI BASTONI");
        cards.add("TRE DI BASTONI");
        cards.add("QUATTRO DI BASTONI");
        cards.add("CINQUE DI BASTONI");
        cards.add("SEI DI BASTONI");
        cards.add("SETTE DI BASTONI");
        cards.add("OTTO DI BASTONI");
        cards.add("NOVE DI BASTONI");
        cards.add("DIECI DI BASTONI");

        cards.add("ASSO DI DENARI");
        cards.add("DUE DI DENARI");
        cards.add("TRE DI DENARI");
        cards.add("QUATTRO DI DENARI");
        cards.add("CINQUE DI DENARI");
        cards.add("SEI DI DENARI");
        cards.add("SETTE DI DENARI");
        cards.add("OTTO DI DENARI");
        cards.add("NOVE DI DENARI");
        cards.add("DIECI DI DENARI");

        //RANDOMIZATION OF THE MAZZO
        for (int i=0; i < 1600; i++){       
            int size = cards.size();
            int randomNum = ThreadLocalRandom.current().nextInt(size);
            String tmpCard = cards.get(randomNum);
            this.cards.remove(tmpCard);
            cards.add(tmpCard);
        }
        
        //IF YOU WIN ONE OF THESE CARDS YOU GET -> INT POINTS AT THE END
        this.cardValue.put("ASSO", 11);
        this.cardValue.put("TRE", 10);
        this.cardValue.put("OTTO", 2);
        this.cardValue.put("NOVE", 3);
        this.cardValue.put("DIECI", 4);
    
        }

    public String getCard(){
        
        String tmpCard = cards.get(0); //since it is randomized, we can treat it like a stack and pick the first one
        this.cards.remove(tmpCard);
        return tmpCard;

    }

    public boolean hasCards(){
        return !this.cards.isEmpty();
    }

    public int getNumberOfCards(){
        return this.cards.size();
    }

    public void  printMazzo(){
        System.out.println(cards.toString());
        System.out.printf("Number of cards: " + Integer.toString(cards.size()) + "\n");
    }

    public int getValue(String card){
        return this.cardValue.get(card);
    }

    public String[] getKeys(){
        String[] keys = new String[this.cardValue.size()];

        int index = 0;
        for (String str : this.cardValue.keySet()){
            keys[index++] = str;
        }
        return keys;
    }

}

