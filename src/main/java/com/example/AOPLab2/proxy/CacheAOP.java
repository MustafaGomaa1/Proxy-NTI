package com.example.AOPLab2.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CacheAOP {

    @Around("@annotation(com.example.AOPLab2.proxy.Cachable)")
    public void enterMethod(ProceedingJoinPoint jp) throws Throwable {
        try {
            System.out.println("ANNOTATION_LOG: Enter method { " + jp.getSignature().getName() + " } \n\n");
            Object obj = jp.proceed();
            System.out.println("ANNOTATION_LOG: Finish method { " + jp.getSignature().getName() + " }\n\n");
        }catch (Throwable e){
            System.out.println("ANNOTATION_LOG: Error method { " + jp.getSignature().getName() + " }\n\n");
        }finally {
            System.out.println("ANNOTATION_LOG: Finally method { " + jp.getSignature().getName() + " }\n\n");
        }
    }
}