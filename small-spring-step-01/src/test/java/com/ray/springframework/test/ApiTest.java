package com.ray.springframework.test;

import com.ray.springframework.BeanDefinition;
import com.ray.springframework.BeanFactory;
import com.ray.springframework.test.bean.UserService;
import org.junit.Test;


/**
 * @author ray 2023/2/14
 * @description
 */

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        // 1. 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        // 2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
