package ie.atu;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerID;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotBlank
    private String nationality;
    @NotBlank
    private String club;
    @Min(1)
    private int heightInMetres;
    @NotBlank
    private String position;
    private boolean currentInternational;
    @Min(0)
    private int caps;
    @Min(0)
    private int internationalCaps;
    @Min(0)
    private int goalsTotal;
    @Min(0)
    private int goalsSeason;
    @Min(0)
    private int assistTotal;
    @Min(0)
    private int assistSeason;
    @NotBlank
    private String foot;
    @Min(0)
    private long value;
}
