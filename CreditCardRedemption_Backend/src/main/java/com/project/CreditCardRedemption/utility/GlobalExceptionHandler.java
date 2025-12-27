package com.project.CreditCardRedemption.utility;

import com.project.CreditCardRedemption.exception.RewardsException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RewardsException.class)
    public ResponseEntity<ErrorInfo> meetingSchedulerExceptionHandler (RewardsException exception) {
        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setExceptionMessage(exception.getMessage());
        errorInfo.setErrorCode("E001");
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> meetingSchedulerExceptionHandler (Exception exception) {
        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setExceptionMessage(exception.getMessage());
        errorInfo.setErrorCode("E002");
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorInfo> validatorExceptionHandler(MethodArgumentNotValidException exception ){
        ErrorInfo errorInfo=new ErrorInfo();
        StringBuilder messages = new StringBuilder();
        exception.getBindingResult().getFieldErrors().forEach(error -> { messages.append(error.getDefaultMessage()).append("; "); });
        errorInfo.setExceptionMessage(messages.toString().trim());
        errorInfo.setErrorCode("E003");
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorInfo> validatorExceptionHandler(ConstraintViolationException exception ){
        ErrorInfo errorInfo=new ErrorInfo();
        StringBuilder messages = new StringBuilder(); exception.getConstraintViolations().forEach(violation -> { messages.append(violation.getMessage()).append("; "); });
        errorInfo.setExceptionMessage(messages.toString().trim());
        errorInfo.setErrorCode("E004");
        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }
}
