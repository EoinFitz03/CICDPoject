package ie.atu;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayersService {
    private final PlayersRepository playersRepository;

    public PlayersService(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    public void savePlayer(Players players){
        playersRepository.save(players);
    }

    //GET
    public Players getPlayersById(String playerID){
        return playersRepository.findByPlayerID(playerID);
    }

}
