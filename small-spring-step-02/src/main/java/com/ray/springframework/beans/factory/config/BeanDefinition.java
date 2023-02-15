package com.ray.springframework.beans.factory.config;

/**
 * @author ray 2023/2/14
 * @description
 */
public class BeanDefinition {
    // 把 Object 替换为 Class，这样可以把 Bean 的实例化操作放到容器中处理,而不是实例化好后放入容器
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
