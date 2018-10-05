package salvoProyectcom.example.battleship;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BattleshipApplication {

	public static void main(String[] args) {

		SpringApplication.run(BattleshipApplication.class, args);
	}


		@Bean
		public CommandLineRunner initData (PlayerRepository repository){
			return (args) -> {

				repository.save(new Player("Jack@gmail.com"));
				repository.save(new Player("Chloe@hotmail.com"));
				repository.save(new Player("Kim@yahoo.com"));
				repository.save(new Player("David@pirateland.com"));
				repository.save(new Player("Michelle@wonderland.com"));
			};
		}
	}
