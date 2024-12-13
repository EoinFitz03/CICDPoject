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
    @Autowired
    private PlayersService playersService;

    private PlayersService myPService;

    public PlayersController(PlayersService myPService){
        this.myPService = myPService;
    }


    @GetMapping("/{playerID}")
    public ResponseEntity<?> getAllPlayers(@PathVariable String playerID){
        if (playerID.length() > 5 || playerID.isBlank()){
            return ResponseEntity.badRequest().body("playerID is invalid");
        }

        Players player = myPService.getPlayersById(playerID);

        if(player == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(player);
    }

    @PostMapping
    public ResponseEntity<String>addTransfer(@RequestBody @Valid Players newPlayer){
        myPService.savePlayer(newPlayer);
        return new ResponseEntity<>("new transfer added", HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<String> updatePlayer(@PathVariable String name, @RequestBody Players updatedPlayers){
        playersService.updatePlayer(name, updatedPlayers);
        return new ResponseEntity<>("Player updated successfully", HttpStatus.OK);
    }



}
