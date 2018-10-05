package salvoProyectcom.example.battleship;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
    public class Game {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
        @GenericGenerator(name = "native", strategy = "native")
        private long id;


        private String Date;

        public Game() {
        }

        public Game(String Date) {  }

        public String getDate() {

//            Date = Date.toInstant();
//            instant.plusSecond(n);
//            Date.from(instant);
//            Date newDate = Date.from(date.toInstant().PlusSecond(3600));


            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            
            return Date;
        }

        public void setDate(String Date) {
            this.Date = getDate();
        }

        public String toString() {
            return Date;
        }


    }

