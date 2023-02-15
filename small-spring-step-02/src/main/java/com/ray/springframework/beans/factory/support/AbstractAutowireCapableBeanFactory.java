package com.ray.springframework.beans.factory.support;

import com.ray.springframework.beans.BeansException;
import com.ray.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ray 2023/2/15
 * @description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
