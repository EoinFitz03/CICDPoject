package ie.atu;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
@RequestMapping("/Login")
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> getAllLogins(@PathVariable String loginid) {


        Login login = loginService.getLoginByid(loginid);

        if (login == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(login);
    }


    @PostMapping("/createLogin")
    public ResponseEntity<String> createLogin(@Valid @RequestBody Login login) {
        loginService.saveLogin(login);
        return new ResponseEntity<>("User created successfully", HttpStatus.OK);
    }



}
