package salvoProyectcom.example.battleship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class BattleshipApplication {

	public static void main(String[] args) {

		SpringApplication.run(BattleshipApplication.class, args);
	}

		@Bean
		public CommandLineRunner initData (PlayerRepository repository,GameRepository repositoryGame,GamePlayerRepository repositoryGamePlayer){
			return (args) -> {

				Player p1= new Player("c.obrian@ctu.gov");
				repository.save(p1);
				Player p2= new Player("j.bauer@ctu.gov");
				repository.save(p2);
				Player p3=new Player("t.alameida@ctu.gov");
				repository.save(p3);
				Player p4=new Player("kim_bauer@gmail.com");
				repository.save(p4);

				Date newDate = new Date();
				newDate = Date.from(newDate.toInstant().plusSeconds(3600));
				Date newDate2 =  Date.from(newDate.toInstant().plusSeconds(3600));
				Date newDate3 =  Date.from(newDate2.toInstant().plusSeconds(3600));
				Date newDate4 =  Date.from(newDate3.toInstant().plusSeconds(3600));
				Date newDate5 =  Date.from(newDate4.toInstant().plusSeconds(3600));
				Date newDate6 =  Date.from(newDate5.toInstant().plusSeconds(3600));
				Date newDate7 =  Date.from(newDate6.toInstant().plusSeconds(3600));

				Game game1 = new Game();
				repositoryGame.save(game1);

				Game game2 = new Game();
				game2.setDate(newDate);
				repositoryGame.save(game2);

				Game game3 = new Game();
				game3.setDate(newDate2);
				repositoryGame.save(game3);

				Game game4 = new Game();
				game4.setDate(newDate3);
				repositoryGame.save(game4);

				Game game5 = new Game();
				game5.setDate(newDate4);
				repositoryGame.save(game5);

				Game game6 = new Game();
				game6.setDate(newDate5);
				repositoryGame.save(game6);

				Game game7 = new Game();
				game7.setDate(newDate6);
				repositoryGame.save(game7);

				Game game8 = new Game();
				game8.setDate(newDate7);
				repositoryGame.save(game8);

				GamePlayer gp1 = new GamePlayer(p1, game1);
				repositoryGamePlayer.save(gp1);
				GamePlayer gp2 = new GamePlayer(p2, game1);
				repositoryGamePlayer.save(gp2);

				GamePlayer gp3 = new GamePlayer(p1, game2);
				repositoryGamePlayer.save(gp3);
				GamePlayer gp4 = new GamePlayer(p2, game2);
				repositoryGamePlayer.save(gp4);

				GamePlayer gp5 = new GamePlayer(p3, game3);
				repositoryGamePlayer.save(gp5);
				GamePlayer gp6 = new GamePlayer(p4, game3);
				repositoryGamePlayer.save(gp6);

				GamePlayer gp7 = new GamePlayer(p1, game4);
				repositoryGamePlayer.save(gp7);
				GamePlayer gp8 = new GamePlayer(p4, game4);
				repositoryGamePlayer.save(gp8);


				GamePlayer gp9 = new GamePlayer(p2, game5);
				repositoryGamePlayer.save(gp9);
				GamePlayer gp10 = new GamePlayer(p3, game5);
				repositoryGamePlayer.save(gp10);

 				GamePlayer gp11 = new GamePlayer(p1, game6);
				repositoryGamePlayer.save(gp11);

				GamePlayer gp12 = new GamePlayer(p2, game7);
				repositoryGamePlayer.save(gp12);


 				GamePlayer gp13 = new GamePlayer(p2, game8);
				repositoryGamePlayer.save(gp13);
				GamePlayer gp14 = new GamePlayer(p3, game8);
				repositoryGamePlayer.save(gp14);

			};
		}
	}
