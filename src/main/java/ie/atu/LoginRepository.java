package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Long> {

    Login findByLoginid(String loginid);
}
