package com.example.AOPLab2.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingProxy {

    @Before("execution(* com.example.AOPLab2.UserServiceImp.SendTo(..))")
    public void before(JoinPoint jp) {
        System.out.println("LOG: BEFORE ==> "+jp.getSignature().getName()+"\n\n");
    }

    @After("execution(* com.example.AOPLab2.*.*(..))")
    public void after(JoinPoint jp) {
        System.out.println("LOG: AFTER ==> "+jp.getSignature().getName()+"\n\n");
    }

    @AfterThrowing("execution(* com.example.AOPLab2.*.*(..))")
    public void afterThrowing(JoinPoint jp, Throwable e) {
        System.out.println("LOG: AFTER THROWING { "+e.toString()+" } ==> "+jp.getSignature().getName()+"\n\n");
    }

    @AfterReturning("execution(* com.example.AOPLab2.UserServiceImp.SendTo(..))")
    public void afterReturning(JoinPoint jp) {
        System.out.println("LOG: AFTER RETURNING  ==> "+jp.getSignature().getName()+"\n\n");
    }

    @Around("execution(* com.example.AOPLab2.*.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("LOG: AROUND BEFORE ==> "+pjp.getSignature().getName()+"\n\n");
        Object obj = pjp.proceed();
        System.out.println("LOG: AROUND AFTER ==> "+pjp.getSignature().getName()+"\n\n");
    }
}
