package ie.atu;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public void updatePlayer(String name, Players updatedPlayer){
        Optional<Players> existingPlayerOptional = playersRepository.findByName(name);

        if(existingPlayerOptional.isPresent()){
            Players existingPlayer = existingPlayerOptional.get();

            existingPlayer.setName(updatedPlayer.getName());
            existingPlayer.setNationality(updatedPlayer.getNationality());
            existingPlayer.setClub(updatedPlayer.getClub());
            existingPlayer.setHeightInMetres(updatedPlayer.getHeightInMetres());
            existingPlayer.setPosition(updatedPlayer.getPosition());
            existingPlayer.setCaps(updatedPlayer.getCaps());
            existingPlayer.setInternationalCaps(updatedPlayer.getInternationalCaps());
            existingPlayer.setGoalsTotal(updatedPlayer.getGoalsTotal());
            existingPlayer.setGoalsSeason(updatedPlayer.getGoalsSeason());
            existingPlayer.setAssistTotal(updatedPlayer.getAssistTotal());
            existingPlayer.setAssistSeason(updatedPlayer.getAssistSeason());
            existingPlayer.setFoot(updatedPlayer.getFoot());
            existingPlayer.setPlayer_value(updatedPlayer.getPlayer_value());

            playersRepository.save(existingPlayer);
        }

    }

    public void deletePlayer(Long id){
        playersRepository.deleteById(id);
    }
}
