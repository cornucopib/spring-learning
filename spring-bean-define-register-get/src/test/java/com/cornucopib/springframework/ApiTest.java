package com.cornucopib.springframework;

import com.cornucopib.springframework.beanfactory.BookService;
import com.cornucopib.springframework.beans.factory.config.BeanDefinition;
import com.cornucopib.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author cornucopib
 * @since 2022/2/23
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        //1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(BookService.class);
        beanFactory.registerBeanDefinition("bookService", beanDefinition);

        BookService bookService = (BookService) beanFactory.getBean("bookService");
        //3.第一次获取bean
        bookService.getBookList();
        //4.第二次获取bean from Singletion
        BookService bookService_singleton = (BookService) beanFactory.getBean("bookService");
        bookService_singleton.getBookList();
    }

}
