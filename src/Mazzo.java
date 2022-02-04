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


    }

    public String getCard(){
        int size = cards.size();
        int randomNum = ThreadLocalRandom.current().nextInt(1, size);
        String tmpCard = cards.get(randomNum);
        this.cards.remove(randomNum);
        return tmpCard;
    }

    public boolean hasCards(){
        return !this.cards.isEmpty();
    }


}
