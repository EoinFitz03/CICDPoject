package ie.atu;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransferService {

    List<Transfers> transfersList = new ArrayList<>();

    @GetMapping("/getTransfers")
    public List<Transfers> getAllTransfers(){
        return transfersList;
    }

    @PostMapping("/addTransfer")
    public String addTransfer(@RequestBody @Valid Transfers transferRequest){
        transfersList.add(transferRequest);
        return "Transfer Details Added";
    }
}
