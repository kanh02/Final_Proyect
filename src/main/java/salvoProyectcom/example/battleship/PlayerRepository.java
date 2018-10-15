package salvoProyectcom.example.battleship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RepositoryRestResource
    public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByUserName(String userName);


}

