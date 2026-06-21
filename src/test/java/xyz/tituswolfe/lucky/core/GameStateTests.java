package xyz.tituswolfe.lucky.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GameStateTests {
    GameState gameState;
    final Player player1 = new Player("player1");
    final Player player2 = new Player("player2");

    @BeforeEach
    public void setup() {
        gameState = new GameState("game-state-test-id");
        gameState.addPlayer(player1);
        gameState.addPlayer(player2);
    }

    @Test
    @DisplayName("Initialize Game")
    public void initializeGame_default_initialized() {
        boolean initialized = gameState.initializeGame();

        for (Player player : gameState.getPlayers()) {
            assertEquals(3, player.getHand().size());
            assertEquals(3, player.getFaceUp().size());
            assertEquals(3, player.getFaceDown().size());
        }

        assertTrue(initialized);
        assertEquals(0, gameState.getActivePlayerIndex());
        assertEquals(GameStatus.PLAYER_TURN, gameState.getCurrentStatus());
    }

    @Test
    @DisplayName("Turn Cycle")
    public void nextTurn_default_advanceActivePlayerIndex() {
        for (int i = 0; i < gameState.getPlayers().size() + 1; i++) {
            int expectedNextPlayerIndex = (gameState.getActivePlayerIndex() + 1) % gameState.getPlayers().size();
            gameState.nextTurn();
            assertEquals(expectedNextPlayerIndex, gameState.getActivePlayerIndex());
        }
    }
}
