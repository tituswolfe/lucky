package xyz.tituswolfe.lucky.core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Player {
    @Getter
    String playerId;

    @Getter
    @Setter
    List<Card> hand;

    @Getter
    @Setter
    List<Card> faceUp;

    @Getter
    @Setter
    List<Card> faceDown;

    Player(String playerId) {
        this.playerId = playerId;
    }
}
