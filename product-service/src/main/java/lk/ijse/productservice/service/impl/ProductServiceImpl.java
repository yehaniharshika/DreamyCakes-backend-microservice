package lk.ijse.productservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.productservice.dto.impl.ProductDTO;
import lk.ijse.productservice.service.ProductService;
import lk.ijse.productservice.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDTO productDTO;
    @Autowired
    private Mapping mapping;

    @Override
    public void saveProduct(ProductDTO productDTO) {

    }
}
