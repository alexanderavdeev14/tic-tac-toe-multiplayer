package alexander.avdeev.games.tictactoemultiplayer.game;

import lombok.*;

@Getter
@Builder
@EqualsAndHashCode
public class Player {
    private final Boolean hasTurn;
    private final Boolean isCross;
}
