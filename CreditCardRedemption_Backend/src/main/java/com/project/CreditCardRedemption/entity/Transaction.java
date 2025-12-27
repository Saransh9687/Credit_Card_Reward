package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;

    private double transactionAmount;

    private LocalDate transactionDate;

    private Long rewardPoints;

    @ManyToOne(fetch = FetchType.LAZY)
    private CreditCard creditCard;

    private boolean processed;


}
