package com.project.CreditCardRedemption.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDTO {
    private Long transactionId;
    private double transactionAmount;
    private LocalDate transactionDate;
    private Long rewardPoints;
    private CreditCardDTO creditCardDTO;
    private boolean processed;
}
