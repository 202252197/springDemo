package com.lvshihao.test.configuration;

import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 20197-4-7$
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
@Component
public class TestUser {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
