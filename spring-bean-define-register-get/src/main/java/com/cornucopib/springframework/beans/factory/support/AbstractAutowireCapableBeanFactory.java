package com.cornucopib.springframework.beans.factory.support;

import com.cornucopib.springframework.beans.BeansException;
import com.cornucopib.springframework.beans.factory.config.BeanDefinition;

/**
 * 拥有自动装配能力的bean工厂,提供bean实例化的能力。
 *
 * @author cornucopib
 * @since 2022/2/23
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
