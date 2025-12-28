package com.project.CreditCardRedemption.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class TransactionDTO {

    private Long transactionId;

    @NotNull(message = "{transaction.amount.required}")
    @Positive(message = "{transaction.amount.positive}")
    private BigDecimal transactionAmount;


    private LocalDate transactionDate;

    private Long rewardPoints;

    private CreditCardDTO creditCardDTO;

    private boolean processed;
}
