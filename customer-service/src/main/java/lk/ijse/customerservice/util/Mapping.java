package lk.ijse.customerservice.util;

import lk.ijse.customerservice.dto.impl.CustomerDTO;
import lk.ijse.customerservice.entity.impl.CustomerEntity;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapping {

    @Autowired
    private ModelMapper modelMapper;

    public CustomerEntity toCustomerEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, CustomerEntity.class);
    }

    public CustomerDTO toCustomerDTO(CustomerEntity customerEntity) {
        return modelMapper.map(customerEntity, CustomerDTO.class);
    }
}
