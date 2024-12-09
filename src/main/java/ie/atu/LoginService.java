package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService{

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    // Placeholder method to save a person (add to Db in the next two weeks)
    public void saveLogin(Login login) {
        loginRepository.save(login);
        System.out.println("Person saved: " + login);
    }

    // Placeholder method to retrieve a person by employeeId
    public Login getLoginByUsername(String username) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return new Login();
    }

}
