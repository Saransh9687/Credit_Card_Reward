package com.project.CreditCardRedemption.api;

import com.project.CreditCardRedemption.dto.CustomerDTO;
import com.project.CreditCardRedemption.entity.Customer;
import com.project.CreditCardRedemption.exception.RewardsException;
import com.project.CreditCardRedemption.service.CustomerManagementService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rewards")
@Validated
public class CustomerManagementApi {
    @Autowired
    CustomerManagementService customerManagementService;
    @Autowired
    Environment environment;

    @PostMapping("/project")
    public ResponseEntity<String> allocateProject (@Valid @RequestBody CustomerDTO customerDTO) throws RewardsException {
        Long id = customerManagementService.createCustomer(customerDTO);

        return new ResponseEntity<>(environment.getProperty("API.ALLOCATION_SUCCESS")+ id, HttpStatus.CREATED);

    }

    @PutMapping("/customer/{findId}")
    public ResponseEntity<String> softDeleteCustomer(@Valid @PathVariable Long findId) throws RewardsException {
        Long id = customerManagementService.softDeleteCustomer(findId);

        return new ResponseEntity<>(environment.getProperty("API.SOFT_DELETE_SUCCESS")+ id, HttpStatus.OK);
    }

    @GetMapping("/customers/page/{page}")
    public ResponseEntity<Page<Customer>> getAllCustomers(@PathVariable int page) {
        Page<Customer> customers = customerManagementService.findAllCustomer(page);

        return ResponseEntity.ok(customers);
    }

    @GetMapping("/customers/name/{name}")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(@PathVariable String name) {
        List<CustomerDTO> fetchCust= customerManagementService.searchCustomerByName(name);

        return new ResponseEntity<>(fetchCust, HttpStatus.OK);
    }

}
