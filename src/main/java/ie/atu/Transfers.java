package ie.atu;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

public class Transfers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String transferId;

    @NotBlank
    private String name;

    @NotNull
    private int ageAtTransfer;

    @NotBlank
    private String previousClub;

    @NotBlank
    private String newClub;

    @NotBlank
    private String transferFee;

    @NotBlank
    private String transferType;

    @NotBlank
    private String transferDate;

    @NotBlank
    private String contractLength;

    @NotBlank
    private String agentFees;


   /* public Transfers(Long id, String transferId, String name, int ageAtTransfer, String previousClub, String newClub, String transferFee, String transferType, String transferDate, String contractLength, String agentFees ){
        this.id  = id;
        this.transferId = transferId;
        this.name = name;
        this.ageAtTransfer = ageAtTransfer;
        this.previousClub = previousClub;
        this.newClub = newClub;
        this.transferFee = transferFee;
        this.transferType = transferType;
        this.transferDate = transferDate;
        this.contractLength = contractLength;
        this.agentFees = agentFees;
    }*/

}
