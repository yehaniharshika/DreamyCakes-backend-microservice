package lk.ijse.customerservice.entity.impl;
import jakarta.persistence.*;
import lk.ijse.customerservice.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class CustomerEntity implements SuperEntity {
    @Id
    private String customerId;
    private String customerName;
    @Column(unique=true)
    private String customerEmail;
    private String address;
    private String contactNum;

}
