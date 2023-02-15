package com.ray.springframework;

/**
 * @author ray 2023/2/14
 * @description 定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
