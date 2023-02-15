package com.ray.springframework.beans.factory;

import com.ray.springframework.beans.BeansException;

/**
 * @author ray 2023/2/15
 * @description
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
