package com.lvshihao.test;

import com.lvshihao.entity.BeanType;
import com.lvshihao.entity.Cat;
import com.lvshihao.entity.Dog;
import com.lvshihao.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 功能描述
 *
 * @author 吕世昊
 * @date 2019-4-7$
 * @describe 想成为世界最厉害的程序员
 * @email 202252197@qq.com
 * @signature 我的梦想---兰博基尼{奋斗}
 */
public class TestSpring {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
    }

    private static void test6() {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //测试自动注入
        User testAuto = ctx.getBean("testAuto", User.class);
        Optional.of(testAuto.getDog().getName()).ifPresent(System.out::println);
    }


    private static void test5() {
        //测试各种类型的注入
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Optional.of("=========================").ifPresent(System.out::println);
        BeanType beanType = ctx.getBean("beanType", BeanType.class);
        Stream.of(beanType.getNames()).forEach(System.out::println);
        Stream.of(beanType.getColors()).forEach(System.out::println);
        Stream.of(beanType.getLears()).forEach(System.out::println);
        Stream.of(beanType.getMaps()).forEach(System.out::println);
        Stream.of(beanType.getProperties()).forEach(System.out::println);
    }

    private static void test4() {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        测试构造方法注入
        Cat cat = ctx.getBean("cat3", Cat.class);
        Optional.of(cat.getName()).ifPresent(System.out::println);
    }

    private static void test3() {
        //测试lazy-init属性--可以看到此pUser1没有被初始化
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //测试依赖bean
        User dependsUser = ctx.getBean("dependsUser", User.class);
        //测试ref引用
        User user = ctx.getBean("User", User.class);
        Optional.of(user.getDog()).ifPresent(System.out::println);
        //测试alias标签
        Dog dogalias = ctx.getBean("dogalias", Dog.class);
        Optional.of(dogalias).ifPresent(System.out::println);
    }

    private static void test2() {
        //测试容器初始化执行bean的init方法
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //测试name属性
        User pUser1 = ctx.getBean("pUser1", User.class);
        User pUser2 = ctx.getBean("pUser2", User.class);
        Optional.of(pUser1+"=="+pUser2).ifPresent(System.out::println);
        //测试scope属性
        boolean equals = ctx.getBean("pUser1", User.class).equals(ctx.getBean("pUser2", User.class));
        Optional.of(equals).ifPresent(System.out::println);
    }

    private static void test1() {
        //1.获取上下文对象,spring里面声明对象都需要通过上下文对象获取
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过这个对象获取我们的user
        User user = (User) ctx.getBean("user");
        Optional.of(user).ifPresent(System.out::println);
        User user1=new User();
        Optional.of(user1).ifPresent(System.out::println);
        System.out.println("============================");
        //下面的方法由于指定了class所有不需要强转
        User user2 = ctx.getBean("user", User.class);
        Optional.of(user2).ifPresent(System.out::println);
        System.out.println("============================");
        //测试抽象的bean
        //User abstractUser = ctx.getBean("abstractUser", User.class);/*可以看到抽象的bean是不能创建的*/
        //测试继承抽象bean的类
        User parentUser = ctx.getBean("parentUser", User.class);
        Optional.of(parentUser).ifPresent(System.out::println);
        //测试bean销毁后执行的方法
        ctx.refresh();
//        ctx.destroy();
        ctx.close();
    }
}
