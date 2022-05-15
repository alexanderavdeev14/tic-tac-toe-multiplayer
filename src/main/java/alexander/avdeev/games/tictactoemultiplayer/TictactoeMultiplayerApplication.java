package alexander.avdeev.games.tictactoemultiplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TictactoeMultiplayerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TictactoeMultiplayerApplication.class).run(args);
	}

}
