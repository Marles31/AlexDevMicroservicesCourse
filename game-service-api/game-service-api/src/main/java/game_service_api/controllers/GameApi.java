package game_service_api.controllers.impl;

import game_service_api.commons.constants.ApiPathVariables;
import game_service_api.commons.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.GAME_ROUTE)
public interface GameApi {

    public ResponseEntity<Game> saveGame(@RequestBody Game game);

}
