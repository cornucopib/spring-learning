package com.cornucopib.springframework;

import com.cornucopib.springframework.beanfactory.BookService;
import com.cornucopib.springframework.beans.config.BeanDefinition;
import com.cornucopib.springframework.beans.support.DefaultListableBeanFactory;
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

        BookService bookService = (BookService) beanFactory.getBean("bookService","基督山伯爵");
        //3.第一次获取bean
        bookService.getBookList();
    }

}
