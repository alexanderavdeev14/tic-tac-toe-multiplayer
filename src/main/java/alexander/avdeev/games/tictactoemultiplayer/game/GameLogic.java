package alexander.avdeev.games.tictactoemultiplayer.game;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.awt.Point;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class GameLogic {

    private final Map<String, GameState> userMap;
    private final Map<String, GameState> gameMap;
    private final Creator creator;
    private final MoveValidator validator;
    private final Linker linker;
    private final Terminator terminator;

    public String createGame(String userID) {
        var game = creator.create(userID);
        updateMaps(userID, game);
        return game.getGameId();
    }

    public Boolean placeMove(String userID, Point move){
        if(!userMap.containsKey(userID)) throw new RuntimeException();
        var game = userMap.get(userID);
        return validator.isValid(game, userID, move);
    }

    public Boolean linkUserToGame(String userId, String gameId){
        var game = gameMap.get(gameId);
        return linker.link(userId, userMap, game);
    }

    public void terminate(String userId){
       terminator.terminate(userMap, gameMap, userId);
    }


    private void updateMaps(String userID, GameState game) {
        userMap.put(userID, game);
    }
}

