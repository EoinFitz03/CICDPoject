package ie.atu;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferService {
    private TransferRepository transferRepository;

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

    /*public void updateTransfer(String name, Transfers updatedTransfers){
        Optional<Transfers> existingtransferOptional = transferRepository.findByName(name);

        if (existingtransferOptional.isPresent()){
            Transfers existingTransfer = existingtransferOptional.get();

            existingTransfer.setName(updatedTransfers.getName());
            existingTransfer.setAgeAtTransfer(updatedTransfers.getAgeAtTransfer());
            existingTransfer.setPreviousClub(updatedTransfers.getPreviousClub());
            existingTransfer.setTransferFee(updatedTransfers.getTransferFee());
            existingTransfer.setTransferType(updatedTransfers.getTransferType());
            existingTransfer.setTransferDate(updatedTransfers.getTransferDate());
            existingTransfer.setContractLength(updatedTransfers.getContractLength());
            existingTransfer.setAgentFees(updatedTransfers.getAgentFees());
            transferRepository.save(existingTransfer);
        }
    }*/

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
