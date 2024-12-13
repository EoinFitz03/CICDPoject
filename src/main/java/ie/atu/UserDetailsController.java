package ie.atu;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.ArrayList;

@RequestMapping("/userDetails")
@RestController
public class UserDetailsController {
    @Autowired
    private final UserDetailsService userDetailsService;

    public UserDetailsController(UserDetailsService userDetailsService) { this.userDetailsService = userDetailsService; }

    @GetMapping("/{detailsId}")
    public ResponseEntity<?> getUserDetails(@PathVariable String detailsId) {
        if (detailsId.length() > 5 || detailsId.isBlank()) {
            return ResponseEntity.badRequest().body("detailsId is invalid");
        }

        UserDetails userDetails = userDetailsService.getUserDetailsByDetailsId(detailsId);


        if (userDetails == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDetails);
    }

    @PostMapping("/createUserDetails")
    public ResponseEntity<String>create(@Valid @RequestBody UserDetails userDetails) {
        userDetailsService.saveUserDetails(userDetails);
        return new ResponseEntity<>("Person created successfully", HttpStatus.OK);
    }
}