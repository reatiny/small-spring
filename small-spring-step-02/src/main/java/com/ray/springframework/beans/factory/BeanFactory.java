package com.ray.springframework.beans.factory;

/**
 * @author ray 2023/2/14
 * @description
 */
public interface BeanFactory {
    Object getBean(String name);
}
