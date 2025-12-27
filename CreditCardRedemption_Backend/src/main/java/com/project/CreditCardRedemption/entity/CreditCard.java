package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;

    private Long rewardPoint;

    @Column(unique = true, nullable = false)
    private String cardNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    private boolean isActive;




}
