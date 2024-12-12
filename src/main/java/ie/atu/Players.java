package ie.atu;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "PLAYERS")
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String playerID;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String nationality;

    @NotBlank
    private String club;

    @NotNull
    private int heightInMetres;

    @NotBlank
    private String position;

    @NotNull
    private int caps;

    @NotNull
    private int internationalCaps;

    @NotNull
    private int goalsTotal;

    @NotNull
    private int goalsSeason;

    @NotNull
    private int assistTotal;

    @NotNull
    private int assistSeason;

    @NotBlank
    private String foot;

    @NotNull
    private int player_value;

    public Players(Long id, String playerID, String name, String surname, String nationality, String club, int heightInMetres, String position, int caps, int internationalCaps, int goalsTotal, int goalsSeason, int assistTotal, int assistSeason, String foot, int player_value){
        this.id = id;
        this.playerID = playerID;
        this.name = name;
        this.surname = surname;
        this.nationality = nationality;
        this.club = club;
        this.heightInMetres = heightInMetres;
        this.position = position;
        this.caps = caps;
        this.internationalCaps = internationalCaps;
        this.goalsTotal = goalsTotal;
        this.goalsSeason = goalsSeason;
        this.assistTotal = assistTotal;
        this.assistSeason = assistSeason;
        this.foot = foot;
        this.player_value = player_value;
    }
}
