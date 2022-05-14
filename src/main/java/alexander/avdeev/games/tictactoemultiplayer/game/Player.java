package alexander.avdeev.games.tictactoemultiplayer.game;

import lombok.*;

@Getter
@Builder
@RequiredArgsConstructor
@EqualsAndHashCode
public class Player {
    private Boolean hasTurn;
    private Boolean isCross;
}
