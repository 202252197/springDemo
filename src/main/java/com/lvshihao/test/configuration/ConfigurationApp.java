package com.lvshihao.test.configuration;

import com.lvshihao.entity.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date $
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
@ComponentScan(basePackages = "com.lvshihao.test.configuration")
public class ConfigurationApp {
    public static void main(String[] args) {
        //如果使用@Configuration配置的可以使用AnnotationConfigApplicationContext进行获取此bean
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(springConfiguration.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Optional.of(cat).ifPresent(System.out::println);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Optional.of(cat1).ifPresent(System.out::println);
        TestUser testUser = applicationContext.getBean("testUser", TestUser.class);
        Optional.of(testUser).ifPresent(System.out::println);
    }
}
