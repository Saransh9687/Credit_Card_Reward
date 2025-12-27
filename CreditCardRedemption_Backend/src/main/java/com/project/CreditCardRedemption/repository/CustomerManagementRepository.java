package com.project.CreditCardRedemption.repository;

import com.project.CreditCardRedemption.dto.CustomerDTO;
import com.project.CreditCardRedemption.entity.Customer;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerManagementRepository extends JpaRepository<Customer, Integer> {
    Customer findByCustomerId(Integer customerId);

    boolean existsByCustomerEmail(@NotNull(message = "{customer.email.notnull}") @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@(gmail\\.com|tcs\\.com)$",
            message = "Email must be a valid Gmail or TCS email address"
    ) String customerEmail);

    boolean existsByPhoneNumber(@NotNull(message = "{customer.phoneNumber.notnull}") @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must be exactly 10 digits"
    ) String phoneNumber);

    List<Customer> findByCustomerName(String findName);
}
