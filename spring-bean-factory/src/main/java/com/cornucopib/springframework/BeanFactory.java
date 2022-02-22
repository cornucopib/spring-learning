package com.cornucopib.springframework;

import java.util.HashMap;
import java.util.Map;

/**
 * Spring bean 容器.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class BeanFactory {
    private Map<String, BeanDefine> beanDefineMap = new HashMap<>();

    public void registerBeanDefine(String beanName, BeanDefine beanDefine) {
        this.beanDefineMap.put(beanName, beanDefine);
    }

    public Object getBean(String beanName) {
        return this.beanDefineMap.get(beanName).getObject();
    }


}
