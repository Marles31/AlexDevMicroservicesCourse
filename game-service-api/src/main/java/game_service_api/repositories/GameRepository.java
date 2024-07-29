package game_service_api.repositories;

import game_service_api.commons.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
