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
    private Long card_id;

    private Long reward_point;

    @Column(unique = true, nullable = false)
    private String card_number;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    private boolean is_active;




}
