package com.kuang.service.impl;


import com.kuang.mapper.BooksMapper;
import com.kuang.pojo.Books;
import com.kuang.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QLBF
 * @version 1.0
 * @date 2021/4/14 14:49
 */
@Service(value = "bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BooksMapper booksMapper;
    public List<Books> queryAllBook() {
        List<Books> books = booksMapper.selectAll();
        return books;
    }
}
