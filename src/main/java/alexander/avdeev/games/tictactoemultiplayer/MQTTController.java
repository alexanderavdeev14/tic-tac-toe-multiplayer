package alexander.avdeev.games.tictactoemultiplayer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
public class MQTTController {

    @GetMapping("/createGame")
    public ResponseEntity<String> createGame(@CookieValue String userId){
        return ResponseEntity.ok("null");
    }

}

