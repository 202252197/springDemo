package com.lvshihao.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Optional;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-7$
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class AroundAop {
    public Object aroundAop(ProceedingJoinPoint pjp){
        try{
            Optional.of("老子环绕通知").ifPresent(System.out::println);
            Object proceed = pjp.proceed();
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
