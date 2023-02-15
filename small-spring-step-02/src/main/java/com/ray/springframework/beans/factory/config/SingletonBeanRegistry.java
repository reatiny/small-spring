package com.ray.springframework.beans.factory.config;

/**
 * @author ray 2023/2/14
 * @description 定义一个获取单例对象的接口
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
