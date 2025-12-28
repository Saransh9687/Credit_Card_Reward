package com.project.CreditCardRedemption.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor @NoArgsConstructor
public class RedemptionHistoryDTO {

    private Long redemptionHistoryId;

    private Long redeemedPoints;

    private LocalDate redeemedDate;

    private CreditCardDTO creditCardDto;

    private CustomerDTO customerDto;
}
