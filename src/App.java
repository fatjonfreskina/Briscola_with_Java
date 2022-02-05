// Questions:
// 1) Do you need to import the classes and methods (are they called packages?)
// in each .java file? Probably not
// 2) Everything public? Come on bro
// 3) What about static and final? 

import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {

        

        GameLoop game = new GameLoop(); // the method prints Game Began
        Mazzo mazzo = new Mazzo();
        Player player1 = new Player(); // prints Player created
        Player player2 = new Player(); // prints Player created

        for (int i = 0; i < 3; i++) {
            player1.pickCard(mazzo);// 


        String tmpCard1 = player1.throwCard();
        System.out.printf("player 1 throws: " + tmpCard1 + '\n');
        String tmpCard2 = player2.throwCard();
        System.out.printf("player 2 throws: " + tmpCard2 + '\n');
        System.out.println("player 1 won for some reason");
        
        player1.addToWonCards(tmpCard1, tmpCard2);
        System.out.printf("Player 1 won cards: " + player1.wonCards + '\n');

        System.out.printf("Calling checkGame: " + game.checkGame(mazzo) + '\n');
        
        player1.dispPlayerCard();
        player2.dispPlayerCard();

        System.out.println(mazzo.hasCards());
        

    }

final Player isWinner(Player player1, String card1, Player player2, String card2){
    int randomNum = ThreadLocalRandom.current().nextInt(1, 2);
    if (randomNum == 1){
        return player1;}
    else {
        return player2;}
    }
}