package com.project.CreditCardRedemption.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CreditCardDTO {

    private Long cardId;

    private String cardNumber;

    private Long rewardPoint;

    private CustomerDTO customerDto;

    private boolean isActive;
}
