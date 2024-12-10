package ie.atu;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository  extends JpaRepository<Transfers, Long> {

    Transfers findByTransferId(String transferId);

}
