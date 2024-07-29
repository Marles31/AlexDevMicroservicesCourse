package game_service_api.controllers;

import game_service_api.commons.constants.ApiPathVariables;
import game_service_api.commons.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathVariables.V1_ROUTE + ApiPathVariables.GAME_ROUTE)
public interface GameApi {

    @PostMapping
    ResponseEntity<Game> saveGame(@RequestBody Game game);
    @GetMapping("/{id}")
    ResponseEntity<Game> getNameById(@PathVariable Long id);

}
