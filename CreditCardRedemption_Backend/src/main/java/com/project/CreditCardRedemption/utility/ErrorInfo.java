package com.project.CreditCardRedemption.utility;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorInfo {
    String exceptionMessage;
    String errorCode;
}
