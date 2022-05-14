package alexander.avdeev.games.tictactoemultiplayer.exception;

public class PlayerIsNotKnown extends RuntimeException{
    public PlayerIsNotKnown(String gameId){
        super("Player is no more active for the gameId: "+gameId);
    }

}
