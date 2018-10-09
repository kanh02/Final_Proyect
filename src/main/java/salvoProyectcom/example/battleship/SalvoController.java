package salvoProyectcom.example.battleship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toList;


@RestController
@RequestMapping("/api")

public class SalvoController {


        @Autowired
        private GameRepository repogame;

        @RequestMapping("/Game")
        public List<Map<String,Object>> getGame() {
            return repogame.findAll().stream().map(Game ->makeGameDTO(Game)).collect(toList());
        }

     private Map<String, Object> makeGameDTO(Game game) {
        Map<String, Object> dto = new LinkedHashMap<String, Object>();
        Set<GamePlayer> gps= game.getGamePlayers();
        dto.put("id", game.getId());
        dto.put("date", game.getDate());
        dto.put("gameplayer",gps.stream().map(gamePlayer -> makeGamePlayerDTO(gamePlayer)));
        return dto;
    }

        private Map<String,Object>makePlayerDTO(Player player){
            Map<String,Object>dto =new LinkedHashMap<String,Object>();
            dto.put("UserName", player.getUserName());
            dto.put("id",player.getId());
            return dto;
        }
        private Map<String,Object>makeGamePlayerDTO(GamePlayer gamePlayer){
            Map<String,Object>dto =new LinkedHashMap<String,Object>();
            dto.put("id",gamePlayer.getId());
            dto.put("Player",makePlayerDTO(gamePlayer.getPlayer()));

            return dto;
        }


    }

