package com.zhr.springhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    //    ioc在创建实例化对象的时候，使用的是工厂模式：class.forname().newinstance来创建对象，
    //    因此该类必须要有无参构造。

    public static void main(String[] args) {
        // 获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Ioc中的bean对象
        /**
         * 获取bean的三种方式
         * */
        // 1.根据bean id获取
//        Student student = (Student) ioc.getBean("student");
//        System.out.println(student);
        // 2. 根据类名来获取 (要求ioc容器中有且只有一个类型匹配的bean)
        // 若没有任何一个类型匹配的bean，会抛出异常
//        Student bean = ioc.getBean(Student.class);
//        System.out.println(bean);
        // 3.根据bean的id和类型获取
        Student student = ioc.getBean("student", Student.class);
        System.out.println(student);

    }

}
