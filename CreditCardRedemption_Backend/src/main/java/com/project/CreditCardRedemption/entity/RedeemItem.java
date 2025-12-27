package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reward_item")
public class RedeemItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_id;
    private String item_name;
    private String item_category;
    private Long item_amount;
}
