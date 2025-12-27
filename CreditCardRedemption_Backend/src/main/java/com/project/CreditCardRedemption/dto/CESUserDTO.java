package com.project.CreditCardRedemption.dto;

import com.project.CreditCardRedemption.enum_.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CESUserDTO {

    private Long cesUserId;
    private String cesUsername;
    private String cesPassword;
    private Role role;
}
