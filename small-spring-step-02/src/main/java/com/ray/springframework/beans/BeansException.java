package com.ray.springframework.beans;

/**
 * @author ray 2023/2/14
 * @description 定义 Bean 异常
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
