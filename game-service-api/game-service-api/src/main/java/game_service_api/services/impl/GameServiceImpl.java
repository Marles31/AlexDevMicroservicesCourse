package game_service_api.services;

import game_service_api.commons.entities.Game;
import game_service_api.controllers.GameApi;
import game_service_api.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl {

    @Autowired
    private GameRepository gameRepository;

    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

//    public Game getGameById(Long id){
//        return gameRepository.findById(id);
//    }

}
