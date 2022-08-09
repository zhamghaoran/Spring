package com.zhr;

import com.zhr.springhello.factory.UserfactoryBean;
import com.zhr.springhello.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringFactoryTest {
    @Test
    public void testFactory() {
        ApplicationContext ioc =  new ClassPathXmlApplicationContext("spring-factory.xml");
        User factory = (User) ioc.getBean(User.class);
        System.out.println(factory);
    }

}
