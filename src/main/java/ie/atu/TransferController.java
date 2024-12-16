package ie.atu;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/transfers")
public class TransferController {
    @Autowired
    private TransferService myTService;

    public TransferController(TransferService myTService){
        this.myTService = myTService;
    }


    @GetMapping("/{transferId}")
    public ResponseEntity<?> getAllTransfers(@PathVariable String transferId){

        if (transferId.length() > 5 ){
            return ResponseEntity.badRequest().body("TransferId is not valid");
        }

        Transfers transfer = myTService.getTransfersById(transferId);

        if (transfer == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(transfer);
    }

    @PostMapping
    public ResponseEntity<String>addTransfer(@RequestBody @Valid Transfers newTransfer){
       myTService.saveTransfer(newTransfer);
       return new ResponseEntity<>("new transfer added", HttpStatus.OK);
    }

    @PutMapping("/{name}")
    public ResponseEntity<String> updateTransfer(@PathVariable String name, @RequestBody Transfers updatedTransfer){
        myTService.updateTransfer(name, updatedTransfer);
        return new ResponseEntity<>("Transfer updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTransfer(@PathVariable Long id){
        myTService.deleteTransfer(id);
        return new ResponseEntity<>("Transfer deleted successfully", HttpStatus.OK);
    }

}
