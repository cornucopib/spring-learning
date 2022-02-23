package com.cornucopib.springframework.beanfactory;

/**
 * 书籍Service.
 *
 * @author cornucopib
 * @since 2022/2/22
 */
public class BookService {

    private String name;

    public BookService(String name) {
        this.name = name;
    }

    public void getBookList() {
        System.out.println("查询书籍列表:"+this.name);
    }

}
