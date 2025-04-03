package lk.ijse.productservice.util;
import lk.ijse.productservice.dto.impl.ProductDTO;
import lk.ijse.productservice.entity.impl.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    public ProductEntity toProductEntity(ProductDTO userDTO) {
        return modelMapper.map(userDTO, ProductEntity.class);
    }

    public ProductDTO toProductDTO(ProductEntity productEntity) {
        return modelMapper.map(productEntity, ProductDTO.class);
    }
}
