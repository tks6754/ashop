package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.domain.CategoryProperty;

import java.util.List;

/**
* CategoryPropertyMapper
*
* @author miao
* @created 2019-12-07T18:28:17.582
*/
public interface CategoryPropertyMapper {

    /**
     * 保存类目属性
     * @param categoryProperty
     * @return
     */
    long saveCategoryProperty(CategoryProperty categoryProperty);

    /**
     * 删除类目属性
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 更新类目属性
     * @param categoryProperty
     * @return
     */
    int updateCategoryProperty(CategoryProperty categoryProperty);

    /**
     * 获取指定类目属性
     * @param id
     * @return
     */
    CategoryProperty getById(Long id);

    /**
     * 类目属性列表
     * @param categoryId
     * @return
     */
    // TODO: 2019/12/31 连表groupName
    List<CategoryProperty> listByCategoryId(Long categoryId);

}