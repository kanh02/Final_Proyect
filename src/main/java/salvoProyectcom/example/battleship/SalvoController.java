    package salvoProyectcom.example.battleship;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import java.lang.reflect.Type;
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
            @Autowired
            private GamePlayerRepository repogameplayer;
            @RequestMapping("/Game_view/{id}")
            public Map<String, Object> makegameplayerInfoDTO (@PathVariable Long id) {
                Map<String,Object> repogameplayerInfoDTO = new LinkedHashMap<>();
                GamePlayer gameplayer  = repogameplayer.findOne(id);
                Set<Ship>gameplayerShip = gameplayer.getShips();
                repogameplayerInfoDTO.put("game",makeGame_viewDTO(gameplayer.getGame()));
                repogameplayerInfoDTO.put("ships",gameplayerShip.stream().map(Ship ->makeShipDTO(Ship)).collect(toList()));
                return repogameplayerInfoDTO;
            }

            private Map<String, Object> makeGameDTO(Game game) {
                Map<String, Object> dto = new LinkedHashMap<String, Object>();
                Set<GamePlayer> gps = game.getGamePlayers();
                dto.put("id", game.getId());
                dto.put("date", game.getDate());
                dto.put("gameplayer",gps.stream().map(gamePlayer -> makeGamePlayerDTO(gamePlayer)).collect(toList()));
                return dto;
            }
            private Map<String,Object>makePlayerDTO(Player player){
                Map<String,Object>dto = new LinkedHashMap<String,Object>();
                dto.put("UserName", player.getUserName());
                dto.put("id",player.getId());
                return dto;
            }
            private Map<String,Object>makeGamePlayerDTO(GamePlayer gamePlayer){
                Map<String,Object>dto = new LinkedHashMap<String,Object>();
                dto.put("id",gamePlayer.getId());
                dto.put("Player",makePlayerDTO(gamePlayer.getPlayer()));
                return dto;
            }


             private Map<String, Object> makeGame_viewDTO(Game game) {
               Map<String, Object> dto = new LinkedHashMap<String, Object>();
              Set<GamePlayer> gps = game.getGamePlayers();
              dto.put("id", game.getId());
              dto.put("date", game.getDate());
              dto.put("gameplayer",gps.stream().map(gamePlayer -> makeGamePlayerDTO(gamePlayer)).collect(toList()));

              return dto;
            }
            private Map<String,Object>makeShipDTO(Ship ship){
                Map<String,Object>shipsDTO = new LinkedHashMap<>();
                shipsDTO.put("type",ship.getType());
                shipsDTO.put("location",ship.getLocations());
                return shipsDTO;
            }
        }





