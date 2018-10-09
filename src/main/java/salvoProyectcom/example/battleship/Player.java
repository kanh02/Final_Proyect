package salvoProyectcom.example.battleship;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;


    @OneToMany(mappedBy="player", fetch=FetchType.EAGER)
    Set<GamePlayer> gamePlayers= new LinkedHashSet<>();

    @JsonIgnore
    public List<Game> getGames(){
    return gamePlayers.stream().map(gp -> gp.getGame()).collect(toList());}

//    public void addPlayer(Player player) {
//        this.player = player;
////        player.setPlayer(this);
////        player.add(player);
//    }


    private String userName;

    public Player() { }

    public Player(String email) { userName = email; }

    public long getId() { return id; }

    public String getUserName() { return userName; }

    public void setId(long id) { this.id = id; }

    public void setGamePlayers(Set<GamePlayer> gamePlayers) { this.gamePlayers = gamePlayers; }

    public void setUserName(String userName) { this.userName = userName; }

    public Set<GamePlayer> getGamePlayers() { return gamePlayers; }
}


