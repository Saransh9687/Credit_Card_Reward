package com.project.CreditCardRedemption.service;

import com.project.CreditCardRedemption.dto.CustomerDTO;
import com.project.CreditCardRedemption.entity.Customer;
import com.project.CreditCardRedemption.exception.RewardsException;
import com.project.CreditCardRedemption.repository.CustomerManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerManagementServiceImpl implements CustomerManagementService {
    @Autowired
    CustomerManagementRepository customerManagementRepository;

    @Override
    public Integer createCustomer(CustomerDTO customer) throws RewardsException {
        if(customerManagementRepository.existsByCustomerEmail(customer.getCustomerEmail())) {
            throw new RewardsException("Customer email is already exist");
        }
        if(customerManagementRepository.existsByPhoneNumber(customer.getPhoneNumber())) {
            throw new RewardsException("Phone number is already exist");
        }

        Customer cust = new Customer();
        cust.setCustomerId(customer.getCustomerId());
        cust.setCustomerName(customer.getCustomerName());
        cust.setCustomerEmail(customer.getCustomerEmail());
        cust.setDateOfJoining(customer.getDateOfJoining());
        cust.setPhoneNumber(customer.getPhoneNumber());

        Customer custSave = customerManagementRepository.save(cust);

        return custSave.getCustomerId();
    }

    @Override
    public Integer softDeleteCustomer(Integer customerId) throws RewardsException {
        Customer cust = customerManagementRepository.findByCustomerId(customerId);
        if(cust == null){
            throw new RewardsException("Customer not found");
        }
        if(cust.isDeleted()) {
            throw new RewardsException("Customer already deleted");
        }
        cust.setDeleted(true);
        Customer custSave = customerManagementRepository.save(cust);

        return custSave.getCustomerId();
    }

    @Override
    public Page<Customer> findAllCustomer(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 10);
        return customerManagementRepository.findAll(pageable);
    }


    @Override public List<CustomerDTO> searchCustomerByName(String findName) {
        List<Customer> customers = customerManagementRepository.findByCustomerName(findName);
        return customers.stream()
                .map(c -> new CustomerDTO(
                        c.getCustomerId(), c.getCustomerName(),
                        c.getCustomerEmail(),
                        c.getDateOfJoining(),
                        c.getPhoneNumber()
                ))
                .toList(); }
}
