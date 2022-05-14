package alexander.avdeev.games.tictactoemultiplayer.game;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class Creator {


    public GameState create(String userId){
        var gameId = UUID.randomUUID().toString();
        GameState gameState = new GameState(gameId, new HashMap<>());
        gameState.getPlayersTurnMap().put(userId, Player.builder().hasTurn(true).isCross(true).build());
        return gameState;
    }
}
