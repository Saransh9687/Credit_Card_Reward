package com.project.CreditCardRedemption.service;

import com.project.CreditCardRedemption.dto.CustomerDTO;
import com.project.CreditCardRedemption.entity.Customer;
import com.project.CreditCardRedemption.exception.RewardsException;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerManagementService {
    Integer createCustomer(CustomerDTO customer) throws RewardsException;

    Integer softDeleteCustomer(Integer customerId) throws RewardsException;

    Page<Customer> findAllCustomer(int pageNumber);

    List<CustomerDTO> searchCustomerByName(String findName);


}
