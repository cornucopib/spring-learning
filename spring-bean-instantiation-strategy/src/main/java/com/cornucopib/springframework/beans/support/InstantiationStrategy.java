package com.cornucopib.springframework.beans.support;

import com.cornucopib.springframework.beans.BeansException;
import com.cornucopib.springframework.beans.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口.
 *
 * @author cornucopib
 * @since 2022/2/23
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;
}
