package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayersRepository extends JpaRepository<Players, Long> {

    Players findByPlayerID(String playerID);

    Optional<Players> findByName(String name);
}