package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author QLBF
 * @version 1.0
 * @date 2021/4/14 14:59
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;



    @RequestMapping("/test")
    @ResponseBody
    public String ptbjson(){
        return "hello 整合!";
    }

    //输出从mysql查询的集合再转为为json到浏览器
    @RequestMapping("/pass")
    @ResponseBody
    public List<Books> ptbjson1(){
        List<Books> books = bookService.queryAllBook();
        return books;
    }

}
