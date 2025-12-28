package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "redemption_history")
public class RedemptionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long redemptionHistoryId;

    private Long redeemedPoints;

    private LocalDate redeemedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private CreditCard  creditCard;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


}
