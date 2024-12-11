package ie.atu;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerID;
    private String name;
    private String surname;
    private String nationality;
    private String club;
    private int heightInMetres;
    private String position;
    private int caps;
    private int internationalCaps;
    private int goalsTotal;
    private int goalsSeason;
    private int assistTotal;
    private int assistSeason;
    private String foot;
    private int value;

    public Players(Long id, String playerID, String name, String surname, String nationality, String club, int heightInMetres, String position, int caps, int internationalCaps, int goalsTotal, int goalsSeason, int assistTotal, int assistSeason, String foot, int value){
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
        this.value = value;
    }
}
