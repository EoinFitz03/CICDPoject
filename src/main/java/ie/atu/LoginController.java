package ie.atu;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Login")
@RestController
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> getUser(@PathVariable String username) {
        if (username.isBlank()) {
            return ResponseEntity.badRequest().body("Username cannot be blank");
        }

        Login login = loginService.getLoginByUsername(username);

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
