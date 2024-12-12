package ie.atu;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService{

    private  LoginRepository loginRepository;

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


    public void deletePerson(Long id) {
        loginRepository.deleteById(id);
    }

    public void updateLogin(String username, Login updatedLogin) {
        Optional<Login> existingLoginOptional = loginRepository.findByUsername(username);

        if (existingLoginOptional.isPresent()) {
            Login existingLogin = existingLoginOptional.get();

            // Update fields with the new data

            existingLogin.setUsername(updatedLogin.getUsername());
            existingLogin.setPassword(updatedLogin.getPassword());
            loginRepository.save(existingLogin);
        }
    }




}
