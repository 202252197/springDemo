package com.lvshihao.testComponent;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
public class Love {
    public void getLove(){
        Optional.of("吕世昊喜欢张莹").ifPresent(System.out::println);
    }
}
