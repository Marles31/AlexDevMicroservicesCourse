package game_service_api.services.impl;

import game_service_api.commons.entities.Game;
import game_service_api.commons.exceptions.GameException;
import game_service_api.repositories.GameRepository;
import game_service_api.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game getGameById(Long id){
        return gameRepository.findById(id).orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "ERROR finding game"));
    }

}
