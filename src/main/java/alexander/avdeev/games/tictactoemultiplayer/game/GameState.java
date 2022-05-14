package alexander.avdeev.games.tictactoemultiplayer.game;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
public class GameState {
    private final String gameId;
    private Boolean gameStarted;
    private final int[][] gameField = new int[3][3];
    private final Map<String, Player> playersTurnMap;
}
