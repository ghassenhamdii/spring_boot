package tn.esprit.tic.project_spring_boot;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* tn.esprit.tic.project_spring_boot.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @After("execution(* tn.esprit.tic.project_spring_boot.service.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of method " + name + " : ");
    }

    @AfterReturning("execution(* tn.esprit.tic.project_spring_boot.service.*.*(..))")
    public void logMethodReturn(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Method " + name + " returned successfully.");
    }

    @AfterThrowing(pointcut = "execution(* tn.esprit.tic.project_spring_boot.service.*.*(..))", throwing = "ex")
    public void logMethodException(JoinPoint joinPoint, Throwable ex) {
        String name = joinPoint.getSignature().getName();
        log.error("Method " + name + " threw an exception : " + ex.getMessage());
    }
}
