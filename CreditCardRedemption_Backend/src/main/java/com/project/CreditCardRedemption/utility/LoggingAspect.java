package com.project.CreditCardRedemption.utility;

import com.project.CreditCardRedemption.exception.RewardsException;
import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(LoggingAspect.class);

    @AfterThrowing(pointcut = "execution(public * com.tcs.tcsInternssystem.service.ProjectAllocationServiceImpl.*(..))",throwing = "exception")
    public void logServiceException(JoinPoint joinPoint, RewardsException exception) {
        log.error("Exception occurs in ProjectAllocationServiceImpl method {}: ", joinPoint.getSignature().getName(), exception);
    }
}
