package com.project.CreditCardRedemption.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Long customerId;

    @NotNull(message = "{customer.name.required}")
    private String customerName;

    @NotNull(message = "{customer.email.required}")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@(gmail\\.com|tcs\\.com)$",
            message = "{customer.email.invalid}"
    )
    private String customerEmail;

    @Past(message = "{customer.dob.past}")
    private LocalDate dateOfBirth;

    @NotNull(message = "{customer.doj.required}")
    @PastOrPresent(message = "{customer.doj.pastOrPresent}")
    private LocalDate dateOfJoining;

    @NotNull(message = "{customer.phoneNumber.required}")
    @Pattern(
            regexp = "^[0-9]{10}$",
            message = "{customer.phoneNumber.invalid}"
    )
    private String phoneNumber;


}
