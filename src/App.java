//TODOS:
//Decide who picks (and throws therefore) the card based on previous winner
//Count points at the end
//Select the winner 
//Create permutation of mazzo -> 
//change method pickcard (not random any more but pick first on top)
//create briscola as mazzo[-1] Zù

import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {

        Mazzo mazzo = new Mazzo();              //mazzo object has getCard, hasCards
        Player player1 = new Player("Johnny");  // prints Player created
        Player player2 = new Player("Sins");    // prints Player created

        for (int i = 0; i < 3; i++) {           // First 3 cards
            player1.pickCard(mazzo);
            player2.pickCard(mazzo);
        }

        while (player1.hasCards()){
            gameTurn(player1, player2, mazzo);
            System.out.printf("Remaining cards: " + mazzo.getNumberOfCards() + "\n");
            System.out.printf("Player 1 won: " + player1.getNumberOfWonCards() + " cards \n");
            System.out.printf("Player 2 won: " + player2.getNumberOfWonCards() + " cards \n");
        }
    }

final static void isWinner(Player player1, String card1, Player player2, String card2, Mazzo mazzo){
    int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
    if (randomNum == 1){ //CASE PLAYER 1 WON -> ADD TO PLAYER 1 WONCARDS
        player1.addToWonCards(card1, card2);
        System.out.println("Player 1 won");
        if (mazzo.hasCards()){
            player1.pickCard(mazzo);
            player2.pickCard(mazzo);
        }
    }
    else {
        player2.addToWonCards(card1, card2);
        System.out.println("Player 2 won");
        if (mazzo.hasCards()){
            player2.pickCard(mazzo);
            player1.pickCard(mazzo);
        }
    }
}
final static void gameTurn(Player player1, Player player2, Mazzo mazzo){
    String card1 = player1.randomThrowCard();
    String card2 = player2.randomThrowCard();
    isWinner(player1, card1, player2, card2, mazzo);

}
}