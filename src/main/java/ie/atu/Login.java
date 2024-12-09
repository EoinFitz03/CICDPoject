package ie.atu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userid;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
