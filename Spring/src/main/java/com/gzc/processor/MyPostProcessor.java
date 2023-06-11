package com.gzc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import javax.annotation.processing.Processor;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/06/11  21:16  周日
 * @Project: SSMTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 初始化前后的后置器
 */

public class MyPostProcessor implements BeanPostProcessor {
    //初始化前后的后置器
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之前执行");
        return bean;
    }

    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化之后执行");
        return bean;
    }


}
