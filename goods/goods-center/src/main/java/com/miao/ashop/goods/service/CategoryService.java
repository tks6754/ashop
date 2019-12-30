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

    /**
     * 删除类目
     * @param id
     * @return
     */
    int deleteCategory(Long id);

    /**
     * 更新类目
     * @param categoryDTO
     * @return
     */
    int updateCategory(CategoryDTO categoryDTO);

    /**
     * 获取指定类目
     * @param id
     * @return
     */
    CategoryDTO getById(Long id);

    /**
     * 类目列表
     * @param categoryQTO
     * @return
     */
    List<CategoryDTO> listCategory(CategoryQTO categoryQTO);

    /**
     * 类目计数
     * @param categoryQTO
     * @return
     */
    long countCategory(CategoryQTO categoryQTO);

}
