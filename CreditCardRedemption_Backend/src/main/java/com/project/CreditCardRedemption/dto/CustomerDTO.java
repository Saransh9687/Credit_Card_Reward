package com.project.CreditCardRedemption.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Integer customerId;
    @NotNull(message = "{customer.name.notnull}")
    private String customerName;
    @NotNull(message = "{customer.email.notnull}")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@(gmail\\.com|tcs\\.com)$",
            message = "Email must be a valid Gmail or TCS email address"
    )
    private String customerEmail;
    @NotNull(message = "{customer.localDate.notnull}")
    private LocalDate dateOfJoining;
    @NotNull(message = "{customer.phoneNumber.notnull}")
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "Phone number must be exactly 10 digits"
    )
    private String phoneNumber;
}
