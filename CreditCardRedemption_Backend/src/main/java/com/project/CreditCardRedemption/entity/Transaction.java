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
    private Long transanction_id;

    private double transaction_amount;

    private LocalDate transaction_Date;

    private Long reward_points;

    @ManyToOne(fetch = FetchType.LAZY)
    private CreditCard credit_card;

    private boolean processed;


}
