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
    private Long redemption_history_id;

    private Long redeemed_points;

    private LocalDate redeemed_date;

    @ManyToOne(fetch = FetchType.LAZY)
    private CreditCard  credit_card;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


}
