package com.ray.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ray 2023/2/14
 * @description Bean 对象的工厂，实现 bean 的注册和获取
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
