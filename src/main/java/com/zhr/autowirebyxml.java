package com.zhr;

import com.zhr.springhello.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class autowirebyxml {
    /**
     * 自动转配：
     * 根据指定的策略,在ioc容器中匹配某个bean，自动为bean中的类类型的属性，或者是接口类型的属性赋值。
     * 可以通过bean标签中的autowire标签来设置自动装配的策略
     * 自动装配的策略：
     * no，default表示：不装配，即bean中的属性不会去匹配某个bean为属性赋值，此时属性使用默认值。
     *ByType : 根据要赋值的属性的类型，在IOC容器中匹配某个bean，为某个属性赋值
     * 注意：
     * 1.若通过类型没有找到任何一个类型匹配的bean，此时不装配，属性使用的是默认值。
     * 2.若通过类型找到了多个类型匹配的bean，会抛出异常
     * 总结：我们在使用bytype在自动装配的时候，ioc容器中只有一个类型匹配的bean能够为属性赋值。
     * byName :将要赋值的属性的属性名作为bean的id在ioc容器中匹配某个bean ，为属性赋值
     * 总结：当类型匹配的bean有多个是可以使用byName来实现自动装配
     * */
    @Test
    public void autowire() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.SaveUser();
    }
}
