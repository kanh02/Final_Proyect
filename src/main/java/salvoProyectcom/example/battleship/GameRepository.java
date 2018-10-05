package salvoProyectcom.example.battleship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
    public interface GameRepository extends JpaRepository<Player, Long> {
    List<Player> findByUserName(String userName);
}
