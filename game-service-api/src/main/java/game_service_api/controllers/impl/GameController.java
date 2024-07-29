package game_service_api.controllers.impl;

import game_service_api.controllers.GameApi;
import game_service_api.commons.entities.Game;
import game_service_api.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController implements GameApi {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public ResponseEntity<Game> saveGame(@RequestHeader("userIdRequest") String userId, @RequestBody Game game) {
        Game savedGame = gameService.saveGame(game);
        return new ResponseEntity<>(savedGame, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Game> getNameById(Long id) {
        return ResponseEntity.ok(gameService.getGameById(id));
    }
}
