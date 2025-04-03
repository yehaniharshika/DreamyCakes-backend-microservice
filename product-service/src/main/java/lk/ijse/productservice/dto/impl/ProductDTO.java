package lk.ijse.productservice.dto.impl;

import lk.ijse.productservice.dto.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO implements ProductStatus {
    private String code;
    private String productName;
    private String desc;
    private String unitPrice;
    private String qtyOnHand;
}
