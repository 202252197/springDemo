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
public class AfterReturningAop {
    public void afterReturningAop(String returnmsg){
        Optional.of("我是返回值通知我的返回值是:"+returnmsg).ifPresent(System.out::println);
    }
}
