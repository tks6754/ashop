package com.miao.ashop.common.http;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TableRet<T> {

    private int total;

    private int startRow;

    private int endRow;

    private boolean pageable;

    private Integer pageSize;

    private Integer pageNum;

    private Integer totalPage;

    private List<T> rows;

}
