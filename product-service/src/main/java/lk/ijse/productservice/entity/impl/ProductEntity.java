package lk.ijse.productservice.entity.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.productservice.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product")
public class ProductEntity implements SuperEntity {
    @Id
    private String code;
    private String productName;
    private String desc;
    private String unitPrice;
    private String qtyOnHand;
}
