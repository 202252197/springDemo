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
public class BeforeAop {
    public void beforeAop(){
        Optional.of("在方法之前执行").ifPresent(System.out::println);
    }
}
