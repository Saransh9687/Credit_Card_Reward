package com.project.CreditCardRedemption.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CustomerDTO {

    private Long customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private LocalDate dOJ;
    private LocalDate dOB;
    private boolean isPresent;
}
