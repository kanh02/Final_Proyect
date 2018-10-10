package salvoProyectcom.example.battleship;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
        import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.util.stream.Collectors.toList;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;


    @OneToMany(mappedBy="game", fetch=FetchType.EAGER)
    Set<GamePlayer> gamePlayers = new LinkedHashSet<>();


    public List<Player> getPlayers(){
        return gamePlayers.stream().map(gp -> gp.getPlayer()).collect(toList());
    }

    private Date date = new Date();

    public Game() { }

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public Date getDate(){
        return this.date;
    }
    public void setDate(Date Data){
        this.date = Data;
    }


    public Set<GamePlayer> getGamePlayers() { return gamePlayers; }
}
