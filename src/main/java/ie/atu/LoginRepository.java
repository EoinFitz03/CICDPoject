package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login,Long> {

    Login findByLoginid(String loginid);

    Optional<Login> findByUsername(String username);
}
