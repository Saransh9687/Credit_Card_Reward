package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reward_item")
public class RedeemItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String itemName;

    private String itemCategory;

    private Long itemAmount;
}
