package com.lvshihao.test.aop;

import org.aspectj.lang.JoinPoint;

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
public class AfterAop {
    public void afterAop(){
        Optional.of("在方法之后执行1").ifPresent(System.out::println);
    }
    //通过JoinPoint可以获取这个方法的所有信息
    public void afterAopAndMsg(JoinPoint joinPoint){
        Optional.of("在方法之后执行2").ifPresent(System.out::print);
        Optional.of(joinPoint.getKind()).ifPresent(System.out::println);
    }
}
