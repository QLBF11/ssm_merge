package com.kuang.mapper;


import com.kuang.pojo.Books;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


/**
 * @author QLBF
 * @version 1.0
 * @date 2021/4/14 15:53
 */
//下面那个Books是你的实体类,ssm整合通用mapper下面@Repository要加，springboot可以不用
@Repository
public interface BooksMapper extends Mapper<Books> {
}
