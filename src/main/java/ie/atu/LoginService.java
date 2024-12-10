package ie.atu;

import org.springframework.stereotype.Service;

@Service
public class LoginService{

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    // Placeholder method to save a person (add to Db in the next two weeks)
    public void saveLogin(Login login) {
        loginRepository.save(login);
    }

    // Placeholder method to retrieve a person by employeeId
    public Login getLoginByid(String loginid) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return loginRepository.findByLoginid(loginid);
    }



}
