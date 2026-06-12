package xyz.tituswolfe.lucky.core;

import lombok.Getter;
import lombok.Setter;

public class Card {
    enum Suit {
        DIAMOND,
        HEART,
        CLUB,
        SPADE
    }
    @Getter
    @Setter
    Suit suit;

    enum Rank {
        ACE,
        KING,
        QUEEN,
        JACK,
        TEN,
        NINE,
        EIGHT,
        SEVEN,
        SIX,
        FIVE,
        FOUR,
        THREE,
        TWO,
    }
    @Getter
    @Setter
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
