package com.lvshihao.test;

import com.lvshihao.entity.Cat;
import com.lvshihao.entity.MyDataSource;
import com.lvshihao.testComponent.Exclude;
import com.lvshihao.testComponent.Love;
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
public class TestResource {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpxa=new ClassPathXmlApplicationContext("resource.xml");
        //测试property-placeholder标签
        MyDataSource myDataSource = cpxa.getBean("myDataSource", MyDataSource.class);
        Optional.of(myDataSource).ifPresent(System.out::println);
        //测试import标签
        Cat bean = cpxa.getBean(Cat.class);
        Optional.of(bean).ifPresent(System.out::println);
        //测试扫包注解
        Love bean1 = cpxa.getBean(Love.class);
        bean1.getLove();
        //测试不扫描此注解
        try{
            Exclude bean2 = cpxa.getBean(Exclude.class);
            bean2.getxxx();
        }catch (Exception e){
            Optional.of("没有此bean").ifPresent(System.out::println);
        }
    }

}
