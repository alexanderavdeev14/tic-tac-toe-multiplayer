package alexander.avdeev.games.tictactoemultiplayer.game;

import java.awt.*;

public class MoveValidator {
    public boolean isValid(GameState game, String userId, Point move) {
        var player = game.getPlayersTurnMap().get(userId);
        if(player.getHasTurn()) {
            var gameField = game.getGameField();
            var cell = gameField[move.x][move.y];
            if(cell == 0) gameField[move.x][move.y] = player.getIsCross() ? 1 : -1;
            else return false;
        }
        return true;
    }
}
