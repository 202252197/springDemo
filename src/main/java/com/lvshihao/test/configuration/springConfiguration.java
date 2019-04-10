package com.lvshihao.test.configuration;

import com.lvshihao.entity.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-7$
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
@Configuration //标注此类是一个配置类相当于我们之前的xml
@ComponentScan(basePackages = {"com.lvshihao.test.configuration"})//将扫描到的所有bean注入到此配置里
public class springConfiguration {
    @Scope(scopeName="prototype")//设置bean的单利或者多利
    @Bean("cat")//设置为bean
    public Cat getCat(){
        return new Cat("吕世昊",55);
    }
}
