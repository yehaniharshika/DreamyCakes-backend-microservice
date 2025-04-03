package lk.ijse.customerservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.customerservice.dao.CustomerDao;
import lk.ijse.customerservice.dto.impl.CustomerDTO;
import lk.ijse.customerservice.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;


    @Override
    public void saveUser(CustomerDTO customerDTO) {

    }
}
