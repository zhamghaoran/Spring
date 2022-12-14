package com.zhr.springhello;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhr.springhello.pojo.Class;
import com.zhr.springhello.pojo.Student;
import com.zhr.springhello.pojo.User;
import javafx.scene.control.TableColumn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    /**
     * ioc在创建实例化对象的时候，使用的是工厂模式：class.forname().newinstance来创建对象，
     * 因此该类必须要有无参构造。
     * 结论：
     * 根据类型来获取bean的时候，在满足唯一bean的前提下，
     * 其实只看：对象 instanceof指定类型，的返回结果
     * 只要返回true就可以认定为和类型匹配，能获取到。
     * 即通过bean的类型，bean所继承的类的类型，bean所实现的接口的类型都可以获取到bean。
     * */

    public static void main(String[] args) throws SQLException {
        // 获取ioc容器
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Ioc中的bean对象
        /*
          获取bean的三种方式
          */
        // 1.根据bean id获取
//        Student student = (Student) ioc.getBean("student");
//        System.out.println(student);
        // 2. 根据类名来获取 (要求ioc容器中有且只有一个类型匹配的bean)
        // 若没有任何一个类型匹配的bean，会抛出异常
//        Student bean = ioc.getBean(Student.class);
//        System.out.println(bean);
        // 3.根据bean的id和类型获取
//        Student student = ioc.getBean("student", Student.class);
//        System.out.println(student);
        /**
         * 测试bean的作用域
         * */
//        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
//        Student student = ioc.getBean("student", Student.class);
//        Student student1 = ioc.getBean("student", Student.class);
//        System.out.println(student.equals(student1));


        /**
         * ConfigurableApplicationContext是applicationContext的子接口，其中扩展了刷新和关闭的方法
         * 1.实例化
         * 2，依赖注入
         * 3，初始化，需要需要通过bean的init-method
         * 4，IOC容器关闭的时候销货，需要通过bean的destroy-method属性指定方法
         *
         * 注意
         * 若bean的作用域为单例时，生命周期的前三个步骤，会在获取ioc容器的时候执行，
         * 若bean的作用域为多例的时候，生命周期的前三个步骤，会在获取bean的时候执行.
         * */

        ConfigurableApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-lifecircle.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        System.out.println(user);
        classPathXmlApplicationContext.close();

    }
}
