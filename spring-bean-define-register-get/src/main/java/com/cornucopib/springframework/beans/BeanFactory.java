package com.cornucopib.springframework.beans;

/**
 * BeanFactory接口.
 * 相对于上节变化：
 * 1. BeanFactory由类变为接口,并且仅仅提供getBean方法，表示提供获取bean的标准以及拥有获取bean的功能。
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public interface BeanFactory {

    Object getBean(String beanName);

}
