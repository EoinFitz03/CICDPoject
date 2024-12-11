package ie.atu;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/players")
public class PlayersController {
    private PlayersService myService;

    public PlayersController(PlayersService myService) {
        this.myService = myService;
    }

    private List<Players> list = new ArrayList<>();

    @GetMapping
    public List<Players> getAll() {
        list = myService.getAllPlayers();
        return list;
    }

    @PostMapping
    public List<Players> newPlayer(@RequestBody Players player) {

        PlayersService.savePlayer(player);

        System.out.println(player);

        list = myService.addPlayer(player);
        return list;
    }


}
