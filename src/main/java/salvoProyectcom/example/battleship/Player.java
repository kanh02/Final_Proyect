package salvoProyectcom.example.battleship;
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

    public List<Game> getGames(){
    return gamePlayers.stream().map(gp -> gp.getGame()).collect(toList());}

//    public void addPlayer(Player player) {
//        this.player = player;
////        player.setPlayer(this);
////        player.add(player);
//    }


    private String userName;

    public Player() { }

    public Player(String email) {
        userName = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String email) {
        this.userName = email;
    }

    public String toString() {
        return userName ;
    }


}


