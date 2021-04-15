package com.kuang.pojo;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author QLBF
 * @version 1.0
 * @date 2021/4/14 14:46
 */

@Data
@Table(name = "books")
public class Books {
    @Id
    private int bookId;

    private String bookName;
    private int bookCounts;
    private String detail;
}
