package ie.atu;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transfers")
public class TransferController {
    @Autowired
    private TransferService transferService;

    private TransferService myTService;

    public TransferController(TransferService myTService){
        this.myTService = myTService;
    }

    private List<Transfers> list = new ArrayList<>();

    @GetMapping
    public List<Transfers> getAllTransfers(){
        return list;
    }

    @PostMapping
    public List<Transfers> newTransfer(@RequestBody @Valid Transfers transfer){
        list = myTService.addTransfer(transfer);
        return list;
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
