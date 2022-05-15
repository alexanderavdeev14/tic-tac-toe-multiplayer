package alexander.avdeev.games.tictactoemultiplayer;

import alexander.avdeev.games.tictactoemultiplayer.configuration.MqttConfiguration;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mqtt")
@AllArgsConstructor
public class MQTTController {

    private final MqttConfiguration.MQTTGateway mqttGateway;

    @GetMapping
    public String send(@RequestParam String m) {
        mqttGateway.sendToMqtt(m);
        return "Message sent: "+m;
    }
}
