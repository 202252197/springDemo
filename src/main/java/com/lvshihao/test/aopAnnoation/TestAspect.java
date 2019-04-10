package com.lvshihao.test.aopAnnoation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
@Component
public class TestAspect {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxac=new ClassPathXmlApplicationContext("aop/spring-aop-annoation.xml");
        TestAspect testAspect = cxac.getBean("testAspect", TestAspect.class);
        testAspect.testAspect();
    }
    public String testAspect(){
        Optional.of("我是测试注解切面方法").ifPresent(System.out::println);
        System.out.println(1/0);
        return "吕世昊";
    }
}
