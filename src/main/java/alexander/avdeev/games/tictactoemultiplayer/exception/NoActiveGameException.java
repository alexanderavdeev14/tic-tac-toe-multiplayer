package alexander.avdeev.games.tictactoemultiplayer.exception;

public class NoActiveGameException extends RuntimeException{
    public NoActiveGameException(String userId){
        super("No active game was found for userId: "+userId);
    }

}
