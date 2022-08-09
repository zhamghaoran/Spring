package com.zhr.springhello.factory;

import com.zhr.springhello.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean是一个接口，需要创建一个类实现接口
 * 其中有三个方法：
 * getObject() 通过一个对象交给IOC容器管理
 * getObject() 设置所提供对象的类型
 * isSingleton()所提供的的对象是否单例
 * 当把factoryBean的实现类配置为bean时，会将当前类中的getObject()所返回的对象交给IOC容器来管理
 *
 * */
public class UserfactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }
    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

}
