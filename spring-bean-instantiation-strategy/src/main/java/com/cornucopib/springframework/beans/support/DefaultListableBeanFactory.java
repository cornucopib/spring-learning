package com.cornucopib.springframework.beans.support;

import com.cornucopib.springframework.beans.BeansException;
import com.cornucopib.springframework.beans.config.BeanDefinition;
import com.cornucopib.springframework.beans.config.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认列举的bean factory.
 * 1. 通过继承父类，实现接口，将bean的获取和定义集中管理.
 *
 * @author cornucopib
 * @since 2022/2/23
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "'is defined");
        }
        return beanDefinition;
    }

}
