package com.project.CreditCardRedemption.entity;

import com.project.CreditCardRedemption.enum_.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ces_user")
public class CESUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ces_user_id;

    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
