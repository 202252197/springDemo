package com.lvshihao.test.aop;

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
public class ThrowingAop {
    public void throwingAop(Exception e){
        Optional.of("我是异常通知出现异常了"+e.getMessage()).ifPresent(System.out::println);
    }
}
