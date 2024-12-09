package ie.atu;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransferService {
    List<Transfers> transfersList = new ArrayList<>();

    //GET
    public List<Transfers> getAllTransfers(){
        return transfersList;
    }

    //POST
    public List<Transfers> addTransfer( Transfers transferRequest){
        transfersList.add(transferRequest);
        return transfersList;
    }

    //PUT
    /*public List<Transfers> updateTransfers(int transferId, Transfers utransfer){
        for(Transfers transfer : transfersList){
            if (transfer.getTransferId() == transferId){
                transfersList.remove(transfer);
            }
        }
        transfersList.add(utransfer);
        return transfersList;
    }

    //DELETE
    public List<Transfers> deleteTransfers(int id){
        for(Transfers t : transfersList) {
            if (t.getTransferId() == id) {
                transfersList.remove(t);
            }
        }
        return transfersList;
    }*/
}
