package ie.atu;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfers {


    private int playerId;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotNull(message = "Name age be blank")
    private int ageAtTransfer;

    @NotBlank(message = "Previous Club cannot be blank")
    private String previousClub;

    @NotBlank(message = "New Club cannot be blank")
    private String newClub;

    @NotBlank(message = "Transfer Fee cannot be blank")
    private String transferFee;

    @NotBlank(message = "Transfer Type cannot be blank")
    private String transferType;

    @NotBlank(message = "Transfer Date cannot be blank")
    private String transferDate;

    @NotBlank(message = "Contract Length cannot be blank")
    private String contractLength;

    private String agentFees;

    private String loanDuration;

}
