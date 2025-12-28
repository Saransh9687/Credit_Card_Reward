package com.project.CreditCardRedemption.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CreditCardDTO {

    private Long cardId;

    @NotBlank(message = "{card.number.required}")
    private String cardNumber;

    @PositiveOrZero(message = "{card.reward.nonNegative}")
    private Long rewardPoint;

    private boolean isActive;

    private Long cutomerId;
}
