package com.ray.springframework.beans.factory.support;

import com.ray.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ray 2023/2/15
 * @description
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
