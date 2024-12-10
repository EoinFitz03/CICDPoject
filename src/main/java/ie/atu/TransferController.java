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
    private TransferService transferService;

    private TransferService myTService;

    public TransferController(TransferService myTService){
        this.myTService = myTService;
    }


    @GetMapping("/{transferId}")
    public ResponseEntity<?> getAllTransfers(@PathVariable String transferId){
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

    /*@PutMapping("/{transferId}")
    public ResponseEntity<List<Transfers>> updateTransfers(@PathVariable @Valid int transferId, @RequestBody @Valid Transfers updatedTransfer){
        List<Transfers> updatedList = transferService.updateTransfers(transferId, updatedTransfer);
        return ResponseEntity.ok(updatedList);
    }

    @DeleteMapping("/{transferId}")
    public ResponseEntity<List<Transfers>> deleteTransfer(@PathVariable int transferId) {
        List<Transfers> updatedList = transferService.deleteTransfers(transferId);
        return ResponseEntity.ok(updatedList);
    }*/
}
