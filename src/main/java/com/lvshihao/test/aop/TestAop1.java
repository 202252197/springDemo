package com.lvshihao.test.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
public class TestAop1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpa=new ClassPathXmlApplicationContext("aop/spring-aop.xml");
        //被增强的类必须有spring容器进行管理,自己实例出来的没有用
        TestAop1 bean = cpa.getBean(TestAop1.class);
        bean.testBerfo();
    }
    public String testBerfo(){
        Optional.of("我被增强了").ifPresent(System.out::println);
        System.out.println(1/0);
        return "吕世昊";
    }
}
