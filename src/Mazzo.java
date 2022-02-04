import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Mazzo{
    ArrayList<String> cards; //class attribute

    public Mazzo(){
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
        cards.add("ASSO DI DENARI");
        cards.add("ASSO DI BASTONI");
    }

    public String getCard(){
        int size = cards.size();
        int randomNum = ThreadLocalRandom.current().nextInt(1, size);
        String tmpCard = cards.get(randomNum);
        this.cards.remove(randomNum);
        return tmpCard;
    }



}
