package alexander.avdeev.games.tictactoemultiplayer.game;

import java.util.Map;

public class Linker {
    public boolean link(String userId, Map<String, GameState> userMap, GameState game){
        game.getPlayersTurnMap().put(userId, Player.builder().hasTurn(false).isCross(false).build());
        var entry = userMap.putIfAbsent(userId, game);
        return entry == null;
    }
}
