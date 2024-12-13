package ie.atu;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransferRepository  extends JpaRepository<Transfers, Long> {

    Transfers findByTransferId(String transferId);

    Optional<Transfers> findByName(String name);
}
