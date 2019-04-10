package com.lvshihao.test.aopAnnoation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Aspect
@Component
public class AllAspect {
    //如果有两个同类型的增强,默认会按照方法名的最后一个数字进行执行顺序,如berfor1,berfor2,也可以使用Order进行执行他们的执行顺序,他们名称的级别大于Order的级别
    @Before(value = "execution(* *.*(..))")
    @Order(2)
    public void befores(){
        Optional.of("我是前置增强").ifPresent(System.out::println);
    }
    @Order(1)
    @Before(value = "execution(* *.*(..))")
    public void befored(){
        Optional.of("我是前置增强2").ifPresent(System.out::println);
    }
    @After(value = "execution(* *.*(..))")
    public void afters(){
        Optional.of("我是后置增强").ifPresent(System.out::println);
    }
    @Around(value = "execution(* *.*(..))")
    public Object arounds(ProceedingJoinPoint proceedingJoinPoint){
       try{
           Optional.of("我是环绕增强").ifPresent(System.out::println);
           Object proceed = proceedingJoinPoint.proceed();
           return proceed;
       } catch (Throwable throwable) {
           Optional.of("出现有一个异常这个方法是:"+proceedingJoinPoint.getSignature().getName()).ifPresent(System.out::println);
           Optional.of(throwable.getMessage()).ifPresent(System.out::println);
           return null;
       }
    }
    @AfterReturning(value = "execution(* *.*(..))",returning = "returs")
    public void returning(Object returs){
        Optional.of("返回值是:"+returs).ifPresent(System.out::println);
    }
    @AfterThrowing(value = "execution(* *.*(..))",throwing = "e")
    public void throwing(JoinPoint joinPoint, Exception e){
        Optional.of("出现有一个异常这个方法是:"+joinPoint.getSignature().getName()).ifPresent(System.out::println);
        Optional.of("您的异常信息是:"+e.getMessage()).ifPresent(System.out::println);
    }
}
