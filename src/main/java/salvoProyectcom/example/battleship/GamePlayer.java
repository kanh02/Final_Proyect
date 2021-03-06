    package salvoProyectcom.example.battleship;
    import org.hibernate.annotations.GenericGenerator;
    import javax.persistence.*;
    import java.util.LinkedHashSet;
    import java.util.Set;

    @Entity
    public class GamePlayer {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
        @GenericGenerator(name = "native", strategy = "native")
        private long id;

            @ManyToOne(fetch = FetchType.EAGER)
            @JoinColumn(name="game_id")
            private Game game;

            @ManyToOne(fetch = FetchType.EAGER)
            @JoinColumn(name="player_id")
            private Player player;


            @OneToMany(mappedBy="gamePlayer", fetch=FetchType.EAGER)
            Set<Ship> ships = new LinkedHashSet<>();


            public GamePlayer() { }

            public GamePlayer(Player player, Game game){

                this.player=player;
                this.game=game;

            }

            public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public Game getGame() {
            return game;
        }

        public void setGame(Game game) {
            this.game = game;
        }

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public Set<Ship> getShips() {
            return ships;
        }

        public void setShips(Set<Ship> ships) {
            this.ships = ships;
        }
    }
