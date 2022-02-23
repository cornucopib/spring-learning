package com.cornucopib.springframework.beans.factory.support;

import com.cornucopib.springframework.beans.BeanFactory;
import com.cornucopib.springframework.beans.BeansException;
import com.cornucopib.springframework.beans.factory.config.BeanDefinition;
import com.cornucopib.springframework.beans.factory.config.DefaultSingletonBeanRegistry;

/**
 * bean容器抽象类.
 * 1. AbstractBeanFactory继承DefaultSingletonBeanRegistry，具备获取单例类的方法。
 * 2. AbstractBeanFactory实现了BeanFactory，实现了getBean方法，并且定义了获取bean的过程，以及抽象方法。
 * 3. AbstractBeanFactory在这里更多的起到了承上启下的作用，其核心作用定义了获取bean的过程：获取bean定义，创建bean。
 * 3.1 呈上：获得了getBean以及getSingleton的方法使用权。
 * 3.2 启下: 将bean定义和创建延迟到子类中。模板模式。
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object singletonBean = getSingleton(beanName);
        if (singletonBean != null) {
            return singletonBean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
