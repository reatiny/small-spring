package com.ray.springframework.beans.factory.config;

/**
 * @author ray 2023/2/15
 * @description
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
