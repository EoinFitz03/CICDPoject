package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

    UserDetails findByDetailsId(String detailsId);


}