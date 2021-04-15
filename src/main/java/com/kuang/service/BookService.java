package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

/**
 * @author QLBF
 * @version 1.0
 * @date 2021/4/14 14:48
 */
public interface BookService {
    List<Books> queryAllBook();
}
