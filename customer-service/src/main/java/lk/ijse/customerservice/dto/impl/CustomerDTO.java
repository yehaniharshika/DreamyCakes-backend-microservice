package lk.ijse.customerservice.dto.impl;
import lk.ijse.customerservice.dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO implements CustomerStatus {
    private String customerId;
    private String customerName;
    private String customerEmail;
    private String address;
    private String contactNum;
}
