package alexander.avdeev.games.tictactoemultiplayer.configuration;

import alexander.avdeev.games.tictactoemultiplayer.configuration.MqttConfiguration;
import alexander.avdeev.games.tictactoemultiplayer.configuration.MqttConfiguration.MQTTGateway;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MqttTest {

    @Autowired
    private MQTTGateway mqttGateway;

    @Test
    void testPublish(){
       mqttGateway.sendToMqtt("Test");
    }
}
