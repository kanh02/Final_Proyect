
package salvoProyectcom.example.battleship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import salvoProyectcom.example.battleship.Player;
import java.util.List;

@RepositoryRestResource
    public interface PlayerRepository extends JpaRepository<Player, Long>{
        List<Player> findByUserName(String userName);
    }
