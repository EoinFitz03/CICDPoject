package ie.atu;

import org.springframework.stereotype.Service;

@Service
public class TransferService {
    private final TransferRepository transferRepository;

    public TransferService(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    public void saveTransfer(Transfers transfers){
        transferRepository.save(transfers);
    }

    //GET
    public Transfers getTransfersById(String transferId){
        return transferRepository.findByTransferId(transferId);
    }

    //POST
    /*public List<Transfers> addTransfer( Transfers transferRequest){
        transfersList.add(transferRequest);
        return transfersList;
    }*/

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
