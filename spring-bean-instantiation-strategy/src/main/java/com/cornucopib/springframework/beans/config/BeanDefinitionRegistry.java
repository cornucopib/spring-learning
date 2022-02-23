package com.cornucopib.springframework.beans.config;

/**
 * 注册bean定义.
 *
 * @author cornucopib
 * @since 2022/2/23
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
