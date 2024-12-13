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
@AllArgsConstructor
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeAtTransfer() {
        return ageAtTransfer;
    }

    public void setAgeAtTransfer(int ageAtTransfer) {
        this.ageAtTransfer = ageAtTransfer;
    }

    public String getPreviousClub() {
        return previousClub;
    }

    public void setPreviousClub(String previousClub) {
        this.previousClub = previousClub;
    }

    public String getNewClub() {
        return newClub;
    }

    public void setNewClub(String newClub) {
        this.newClub = newClub;
    }

    public String getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(String transferFee) {
        this.transferFee = transferFee;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getContractLength() {
        return contractLength;
    }

    public void setContractLength(String contractLength) {
        this.contractLength = contractLength;
    }

    public String getAgentFees() {
        return agentFees;
    }

    public void setAgentFees(String agentFees) {
        this.agentFees = agentFees;
    }
}

