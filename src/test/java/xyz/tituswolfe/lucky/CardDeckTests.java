package xyz.tituswolfe.lucky;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.tituswolfe.lucky.core.Card;
import xyz.tituswolfe.lucky.core.Deck;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CardDeckTests {
    Deck deck;

    @BeforeEach
    public void setup() {
        deck = new Deck();
        deck.reset();
    }

    @Test
    @DisplayName("Shuffle Deck")
    public void shuffleDeck_fullDeck_randomized() {
        // There is a 1/52! chance that the deck is shuffled in the same order.
        deck.shuffle();
        assertNotEquals(Deck.FULL_DECK, deck.getCards());
    }

    @Test
    @DisplayName("Draw Card")
    public void drawCard_fullDeck_removeFirstCard() {
        Card firstCard = deck.getCards().getFirst();
        Card drawnCard = deck.drawCard();

        assertEquals(firstCard, drawnCard);

        if (deck.getCards().contains(firstCard)) {
            fail("Card " + firstCard.getRank() + " of " + firstCard.getSuit() + "s was not removed after drawn.");
        }
    }
}
