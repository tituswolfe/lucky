package xyz.tituswolfe.lucky.core;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

public class Deck {
    @Getter
    @Setter
    private List<Card> cards;

    public final static List<Card> FULL_DECK = List.of(
            new Card(Card.Suit.DIAMOND, Card.Rank.ACE),
            new Card(Card.Suit.DIAMOND, Card.Rank.KING),
            new Card(Card.Suit.DIAMOND, Card.Rank.QUEEN),
            new Card(Card.Suit.DIAMOND, Card.Rank.JACK),
            new Card(Card.Suit.DIAMOND, Card.Rank.TEN),
            new Card(Card.Suit.DIAMOND, Card.Rank.NINE),
            new Card(Card.Suit.DIAMOND, Card.Rank.EIGHT),
            new Card(Card.Suit.DIAMOND, Card.Rank.SEVEN),
            new Card(Card.Suit.DIAMOND, Card.Rank.SIX),
            new Card(Card.Suit.DIAMOND, Card.Rank.FIVE),
            new Card(Card.Suit.DIAMOND, Card.Rank.FOUR),
            new Card(Card.Suit.DIAMOND, Card.Rank.THREE),
            new Card(Card.Suit.DIAMOND, Card.Rank.TWO),
            
            new Card(Card.Suit.HEART, Card.Rank.ACE),
            new Card(Card.Suit.HEART, Card.Rank.KING),
            new Card(Card.Suit.HEART, Card.Rank.QUEEN),
            new Card(Card.Suit.HEART, Card.Rank.JACK),
            new Card(Card.Suit.HEART, Card.Rank.TEN),
            new Card(Card.Suit.HEART, Card.Rank.NINE),
            new Card(Card.Suit.HEART, Card.Rank.EIGHT),
            new Card(Card.Suit.HEART, Card.Rank.SEVEN),
            new Card(Card.Suit.HEART, Card.Rank.SIX),
            new Card(Card.Suit.HEART, Card.Rank.FIVE),
            new Card(Card.Suit.HEART, Card.Rank.FOUR),
            new Card(Card.Suit.HEART, Card.Rank.THREE),
            new Card(Card.Suit.HEART, Card.Rank.TWO),
    
            new Card(Card.Suit.CLUB, Card.Rank.ACE),
            new Card(Card.Suit.CLUB, Card.Rank.KING),
            new Card(Card.Suit.CLUB, Card.Rank.QUEEN),
            new Card(Card.Suit.CLUB, Card.Rank.JACK),
            new Card(Card.Suit.CLUB, Card.Rank.TEN),
            new Card(Card.Suit.CLUB, Card.Rank.NINE),
            new Card(Card.Suit.CLUB, Card.Rank.EIGHT),
            new Card(Card.Suit.CLUB, Card.Rank.SEVEN),
            new Card(Card.Suit.CLUB, Card.Rank.SIX),
            new Card(Card.Suit.CLUB, Card.Rank.FIVE),
            new Card(Card.Suit.CLUB, Card.Rank.FOUR),
            new Card(Card.Suit.CLUB, Card.Rank.THREE),
            new Card(Card.Suit.CLUB, Card.Rank.TWO),

            new Card(Card.Suit.SPADE, Card.Rank.ACE),
            new Card(Card.Suit.SPADE, Card.Rank.KING),
            new Card(Card.Suit.SPADE, Card.Rank.QUEEN),
            new Card(Card.Suit.SPADE, Card.Rank.JACK),
            new Card(Card.Suit.SPADE, Card.Rank.TEN),
            new Card(Card.Suit.SPADE, Card.Rank.NINE),
            new Card(Card.Suit.SPADE, Card.Rank.EIGHT),
            new Card(Card.Suit.SPADE, Card.Rank.SEVEN),
            new Card(Card.Suit.SPADE, Card.Rank.SIX),
            new Card(Card.Suit.SPADE, Card.Rank.FIVE),
            new Card(Card.Suit.SPADE, Card.Rank.FOUR),
            new Card(Card.Suit.SPADE, Card.Rank.THREE),
            new Card(Card.Suit.SPADE, Card.Rank.TWO)
    );

    public void reset() {
        cards = FULL_DECK;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        Card card = cards.getFirst();
        cards.removeFirst();
        return card;
    }
}
