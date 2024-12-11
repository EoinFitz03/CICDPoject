package ie.atu;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayersService {
private static PlayersRepository playersRepository;

public PlayersService(PlayersRepository playersRepository) {
    this.playersRepository = playersRepository;
}
private List<Players> myList = new ArrayList<>();

public static void savePlayer(Players player) {
    playersRepository.save(player);
    System.out.println("Player saved");
}

@GetMapping
    public List<Players> getAllPlayers() {
    return myList;
}

@PostMapping
    public List<Players> addPlayer(Players player) {
    myList.add(player);
    return myList;
}

}
