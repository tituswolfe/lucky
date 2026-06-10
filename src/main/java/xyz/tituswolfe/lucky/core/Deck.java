package xyz.tituswolfe.lucky.core;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

public class Deck {
    @Getter
    @Setter
    private List<Card> cards;

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        Card card = cards.getFirst();
        cards.removeFirst();
        return card;
    }
}
