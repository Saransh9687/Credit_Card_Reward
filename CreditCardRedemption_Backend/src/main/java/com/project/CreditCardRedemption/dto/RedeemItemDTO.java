package com.project.CreditCardRedemption.dto;

import lombok.Data;

@Data
public class RedeemItemDTO {
    private Long itemId;
    private String itemName;
    private String itemCategory;
    private Long itemAmount;
}
