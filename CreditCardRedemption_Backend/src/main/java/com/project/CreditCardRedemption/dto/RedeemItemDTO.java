package com.project.CreditCardRedemption.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class RedeemItemDTO {

    private Long itemId;

    @NotBlank(message = "{redeem.item.name.required}")
    private String itemName;

    @NotBlank(message = "{redeem.item.category.required}")

    private String itemCategory;


    @NotNull(message = "{redeem.item.amount.required}")
    @Positive(message = "{redeem.item.amount.positive}")
    private Long itemAmount;
}

