package com.cornucopib.springframework.beans.factory.config;

/**
 * 单例注册接口.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
