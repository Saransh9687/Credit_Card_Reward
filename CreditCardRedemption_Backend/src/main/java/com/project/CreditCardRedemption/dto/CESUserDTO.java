package com.project.CreditCardRedemption.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.CreditCardRedemption.enum_.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CESUserDTO {

    private Long cesUserId;

    @NotBlank(message = "{ces.username.required}")
    private String cesUsername;

    @NotBlank(message = "{ces.password.required}")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String cesPassword;

    @NotBlank(message = "{ces.role.required}")
    private Role role;
}
