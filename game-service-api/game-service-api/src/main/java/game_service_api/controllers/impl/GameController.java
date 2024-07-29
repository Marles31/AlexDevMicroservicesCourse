package game_service_api.controllers;

import game_service_api.controllers.impl.GameApi;
import game_service_api.commons.entities.Game;
import game_service_api.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameController implements GameApi {

    @Autowired
    private GameService gameService;

    @PostMapping("/save")
    public ResponseEntity<Game> saveGame(@RequestBody Game game) {
        Game savedGame = gameService.saveGame(game);
        return new ResponseEntity<>(savedGame, HttpStatus.CREATED);
    }

}
