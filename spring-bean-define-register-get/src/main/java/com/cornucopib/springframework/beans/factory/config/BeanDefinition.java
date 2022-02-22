package com.cornucopib.springframework.beans.factory.config;

/**
 * Bean定义
 * 相对于上节变化：
 * 1.BeanDefinition，由Object替换为Class，就可以将Bean的实例化交给容器处理.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class BeanDefinition {
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
