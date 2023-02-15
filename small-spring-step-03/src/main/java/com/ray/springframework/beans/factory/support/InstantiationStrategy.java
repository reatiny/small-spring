package com.ray.springframework.beans.factory.support;

import com.ray.springframework.beans.BeansException;
import com.ray.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author ray 2023/2/15
 * @description 定义实例化策略接口
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
