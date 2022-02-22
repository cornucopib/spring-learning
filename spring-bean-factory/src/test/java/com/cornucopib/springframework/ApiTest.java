package com.cornucopib.springframework;

import com.cornucopib.springframework.beanfactory.BookService;
import org.junit.jupiter.api.Test;

/**
 * Api 测试类.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class ApiTest {

    @Test
    public void testBeanFactory(){
        BeanFactory beanFactory = new BeanFactory();
        BeanDefine bookBeanDefine = new BeanDefine(new BookService());
        beanFactory.registerBeanDefine("bookService",bookBeanDefine);

        Object bookService = beanFactory.getBean("bookService");
        ((BookService)bookService).getBookList();
    }

}
