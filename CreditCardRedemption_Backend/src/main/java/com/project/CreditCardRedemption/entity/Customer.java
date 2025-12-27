package com.project.CreditCardRedemption.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;
    private String customer_name;
    private String customer_email;
    private String customer_phone;
    private LocalDate doj;
    private LocalDate dob;
    private boolean is_present =true;


}
