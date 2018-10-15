	package salvoProyectcom.example.battleship;
	import com.sun.deploy.security.ValidationState;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Bean;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import java.time.Instant;
	import java.util.Arrays;
	import java.util.Date;
	import java.util.List;


	@SpringBootApplication
	public class BattleshipApplication {

		public static void main(String[] args) {

			SpringApplication.run(BattleshipApplication.class, args);
		}

			@Bean
			public CommandLineRunner initData (PlayerRepository repository,GameRepository repositoryGame,GamePlayerRepository repositoryGamePlayer,ShipRepository repositoryShip){
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

					List<String> location0 = Arrays.asList("H2","H3","H4");
					List<String> location1 = Arrays.asList("E1","G1","F1");
					List<String> location2 = Arrays.asList("B4","B5");
					List<String> location3 = Arrays.asList("B5","C5","D5");
					List<String> location4 = Arrays.asList("F1","F2");
					List<String> location5 = Arrays.asList("B5","C5","D5");
					List<String> location6 = Arrays.asList("C6","C7");
					List<String> location7 = Arrays.asList("A2","A3","A4");
					List<String> location8 = Arrays.asList("G6","H6");
					List<String> location9 = Arrays.asList("B5","C5","D5");
					List<String> location10 = Arrays.asList("C6","C7");
					List<String> location11 = Arrays.asList("A2","A3","A4");
					List<String> location12 = Arrays.asList("G6","H6");
					List<String> location13 = Arrays.asList("B5","C5","D5");
					List<String> location14 = Arrays.asList("C6","C7");
					List<String> location15 = Arrays.asList("A2","A3","A4");
					List<String> location16 = Arrays.asList("G6","H6");
					List<String> location17 = Arrays.asList("B5","C5","D5");
					List<String> location18 = Arrays.asList("C6","C7");
					List<String> location19 = Arrays.asList("A2","A3","A4");
					List<String> location20 = Arrays.asList("G6","H6");
					List<String> location21 = Arrays.asList("B5","C5","D5");
					List<String> location22 = Arrays.asList("C6","C7");
					List<String> location23 = Arrays.asList("B5","C5","D5");
					List<String> location24 = Arrays.asList("C6","C7");
					List<String> location25 = Arrays.asList("A2","A3","A4");
					List<String> location26 = Arrays.asList("G6","H6");


					Ship b1 = new Ship("Destroyer",location0,gp1);
					repositoryShip.save(b1);
					Ship b2 = new Ship("Submarine",location1,gp1);
					repositoryShip.save(b2);
					Ship b3 = new Ship("Patrol Boat",location2,gp1);
					repositoryShip.save(b3);
					Ship b4 = new Ship("Destroyer",location3,gp1);
					repositoryShip.save(b4);
					Ship b5 = new Ship("Patrol Boat",location4,gp1);
					repositoryShip.save(b5);


					Ship b6 = new Ship("Destroyer",location5,gp2);
					repositoryShip.save(b6);
					Ship b7 = new Ship("Patrol Boat",location6,gp2);
					repositoryShip.save(b7);
					Ship b8 = new Ship("Submarine",location7,gp2);
					repositoryShip.save(b8);
					Ship b9 = new Ship("Patrol Boat",location8,gp2);
					repositoryShip.save(b9);


					Ship b10 = new Ship("Destroyer",location9,gp3);
					repositoryShip.save(b10);
					Ship b11 = new Ship("Patrol Boat",location10,gp3);
					repositoryShip.save(b11);
					Ship b12 = new Ship("Submarine",location11,gp3);
					repositoryShip.save(b12);
					Ship b13 = new Ship("Patrol Boat",location12,gp3);
					repositoryShip.save(b13);


					Ship b14 = new Ship("Destroyer",location13,gp4);
					repositoryShip.save(b14);
					Ship b15 = new Ship("Patrol Boat",location14,gp4);
					repositoryShip.save(b15);
					Ship b16 = new Ship("Submarine",location15,gp4);
					repositoryShip.save(b16);
					Ship b17 = new Ship("Patrol Boat",location16,gp4);
					repositoryShip.save(b17);


					Ship b18 = new Ship("Destroyer",location17,gp5);
					repositoryShip.save(b18);
					Ship b19 = new Ship("Patrol Boat",location18,gp5);
					repositoryShip.save(b19);
					Ship b20 = new Ship("Submarine",location19,gp5);
					repositoryShip.save(b20);
					Ship b21 = new Ship("Patrol Boat",location20,gp5);
					repositoryShip.save(b21);


					Ship b22 = new Ship("Destroyer",location21,gp6);
					repositoryShip.save(b22);
					Ship b23 = new Ship("Patrol Boat",location22,gp6);
					repositoryShip.save(b23);

					Ship b24 = new Ship("Destroyer",location23,gp8);
					repositoryShip.save(b24);
					Ship b25 = new Ship("Patrol Boat",location24,gp8);
					repositoryShip.save(b25);
					Ship b26 = new Ship("Submarine",location25,gp8);
					repositoryShip.save(b26);
					Ship b27 = new Ship("Patrol Boat",location26,gp8);
					repositoryShip.save(b27);

				};
			}
		}
