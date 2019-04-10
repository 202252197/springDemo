package com.lvshihao.entity;

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
public class Dog {
    private String name;

    public Dog() {
        Optional.of("狗先来").ifPresent(System.out::println);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
