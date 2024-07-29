package game_service_api.services;

import game_service_api.commons.entities.Game;

public interface GameService {
    Game saveGame(Game game);
    Game getGameById(Long id);
}
