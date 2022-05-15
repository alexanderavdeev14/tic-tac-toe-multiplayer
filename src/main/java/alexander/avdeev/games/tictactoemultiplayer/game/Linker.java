package alexander.avdeev.games.tictactoemultiplayer.game;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Linker {
    public boolean link(String userId, Map<String, GameState> userMap, GameState game){
        game.getPlayersTurnMap().put(userId, Player.builder().hasTurn(false).isCross(false).build());
        var entry = userMap.putIfAbsent(userId, game);
        return entry == null;
    }
}
