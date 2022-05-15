package alexander.avdeev.games.tictactoemultiplayer.game;

import alexander.avdeev.games.tictactoemultiplayer.exception.NoActiveGameException;
import alexander.avdeev.games.tictactoemultiplayer.exception.PlayerIsNotKnown;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class Terminator {
    public void terminate(Map<String, GameState> users, Map<String, GameState> games, String userId){

        var game = users.get(userId);
        if(game == null) {
            log.debug("No active game was found for userId" + userId);
            throw  new NoActiveGameException(userId);
        }

        var player = game.getPlayersTurnMap().remove(userId);
        if(player == null) {
            log.info("Player is not known for game: " + game.getGameId());
            throw new PlayerIsNotKnown(game.getGameId());
        }

        users.remove(userId);
        if(game.getPlayersTurnMap().isEmpty()) games.remove(game.getGameId());
    }
}
