package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.common.qto.CategoryQTO;
import com.miao.ashop.goods.domain.Category;

import java.util.List;

/**
* CategoryMapper
*
* @author miao
* @created 2019-12-07T18:28:17.582
*/
public interface CategoryMapper {

    long saveCategory(Category category);

    int deleteCategory(Long id);

    int updateCategory(Category category);

    Category getById(Long id);

    List<Category> listCategory(CategoryQTO categoryQTO);

    long countCategory(CategoryQTO categoryQTO);


}