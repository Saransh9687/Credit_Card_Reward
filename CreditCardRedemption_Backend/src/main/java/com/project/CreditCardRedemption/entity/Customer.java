package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String customerName;

    @Column(unique = true,nullable = false)
    private String customerEmail;

    private LocalDate dateOfBirth;

    private LocalDate dateOfJoining;

    @Column(length = 10)
    private String phoneNumber;

    private boolean deleted = false;

    @OneToMany(mappedBy = "customer")
    private List<CreditCard> creditCards;
}
