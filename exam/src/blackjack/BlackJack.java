package blackjack;

/**
 * Created by User on 2017. 04. 18..
 */
public class BlackJack {

  public static void main(String[] args) {
    Deck deck = new Deck(10);
    System.out.println(deck);
    Card drawn = deck.draw();
    System.out.println(drawn);
    System.out.println(deck);
  }
}

