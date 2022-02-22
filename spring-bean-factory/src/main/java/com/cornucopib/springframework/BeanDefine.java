package com.cornucopib.springframework;

/**
 * Bean定义.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class BeanDefine {

    private Object object;

    public BeanDefine(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
