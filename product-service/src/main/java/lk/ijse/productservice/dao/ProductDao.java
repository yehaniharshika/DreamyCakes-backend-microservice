package lk.ijse.productservice.dao;

import lk.ijse.productservice.entity.impl.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity,String> {
}
