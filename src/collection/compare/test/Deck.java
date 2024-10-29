package collection.compare.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() {
        for(int i = 1; i <= 13; i++) {
            for(Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    private void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        return cards.removeFirst(); //remove(0)과 동일
    }
}
