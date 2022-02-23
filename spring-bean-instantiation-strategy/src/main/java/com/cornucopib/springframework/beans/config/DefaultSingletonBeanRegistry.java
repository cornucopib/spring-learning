package com.cornucopib.springframework.beans.config;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认的单例注册实现.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
