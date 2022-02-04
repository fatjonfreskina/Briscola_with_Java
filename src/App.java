//creare classe MAZZO
// creare classe mano: rimuove da mazzo e passa a mano 



public class App {
    public static void main(String[] args) throws Exception {
        Mazzo mazzo = new Mazzo();
        Player player1 = new Player();
        Player player2 = new Player();

        for (int i = 0; i < 3; i++) {
            String tmpCard1 = mazzo.getCard();
            String tmpCard2 = mazzo.getCard();
            player1.addCard(tmpCard1);
            player2.addCard(tmpCard2);
          }
        
        player1.dispPlayerCard();
        player2.dispPlayerCard();
    }
}


