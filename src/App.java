// Questions:
// 1) Do you need to import the classes and methods (are they called packages?)
// in each .java file? Probably not
// 2) Everything public? Come on bro
// 3) What about static and final? 

import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {

        Mazzo mazzo = new Mazzo();     //mazzo object has getCard, hasCards
        Player player1 = new Player(); // prints Player created
        Player player2 = new Player(); // prints Player created

        for (int i = 0; i < 3; i++) { // First 3 cards
            player1.pickCard(mazzo);
            player2.pickCard(mazzo);
        }

        player1.throwCard(); // test this method

    }

final void isWinner(Player player1, String card1, Player player2, String card2){
    int randomNum = ThreadLocalRandom.current().nextInt(1, 2);
    if (randomNum == 1){ //CASE PLAYER 1 WON -> ADD TO PLAYER 1 WONCARDS
        player1.addToWonCards(card1, card2);}
    else {
        player2.addToWonCards(card1, card2);}
}


final void gameTurn(Player player1, Player player2, Mazzo mazzo){
    String card1 = player1.throwCard();
    String card2 = player2.randomThrowCard();
    isWinner(player1, card1, player2, card2);
    player1.pickCard(mazzo);
    player2.pickCard(mazzo);
}
}