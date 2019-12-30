package com.miao.ashop.goods.service;

import com.miao.ashop.goods.common.dto.CategoryDTO;
import com.miao.ashop.goods.common.qto.CategoryQTO;

import java.util.List;

/**
 * 类目服务
 */
public interface CategoryService {

    /**
     * 增加类目
     * @param categoryDTO
     * @return
     */
    long addCategory(CategoryDTO categoryDTO);


    int deleteCategory(Long id);


    int updateCategory(CategoryDTO categoryDTO);


    CategoryDTO getById(Long id);


    List<CategoryDTO> listCategory(CategoryQTO categoryQTO);

    long countCategory(CategoryQTO categoryQTO);

}
