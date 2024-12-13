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
@AllArgsConstructor
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String playerID;

    @NotBlank
    private String name;

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

    /*public Players(Long id, String playerID, String name, String surname, String nationality, String club, int heightInMetres, String position, int caps, int internationalCaps, int goalsTotal, int goalsSeason, int assistTotal, int assistSeason, String foot, int player_value){
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
    }*/

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getHeightInMetres() {
        return heightInMetres;
    }

    public void setHeightInMetres(int heightInMetres) {
        this.heightInMetres = heightInMetres;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public int getInternationalCaps() {
        return internationalCaps;
    }

    public void setInternationalCaps(int internationalCaps) {
        this.internationalCaps = internationalCaps;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }

    public int getGoalsSeason() {
        return goalsSeason;
    }

    public void setGoalsSeason(int goalsSeason) {
        this.goalsSeason = goalsSeason;
    }

    public int getAssistTotal() {
        return assistTotal;
    }

    public void setAssistTotal(int assistTotal) {
        this.assistTotal = assistTotal;
    }

    public int getAssistSeason() {
        return assistSeason;
    }

    public void setAssistSeason(int assistSeason) {
        this.assistSeason = assistSeason;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public int getPlayer_value() {
        return player_value;
    }

    public void setPlayer_value(int player_value) {
        this.player_value = player_value;
    }
}
