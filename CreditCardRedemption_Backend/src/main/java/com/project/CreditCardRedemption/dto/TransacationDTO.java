package com.project.CreditCardRedemption.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransacationDTO {
    private Long transacationId;
    private double transacationAmount;
    private LocalDate transacationDate;
    private Long rewardPoints;
    private CreditCardDTO creditCardDTO;
    private boolean processed;
}
