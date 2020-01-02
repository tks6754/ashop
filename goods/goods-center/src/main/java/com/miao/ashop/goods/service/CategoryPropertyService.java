package com.miao.ashop.goods.service;

import com.miao.ashop.goods.common.dto.CategoryPropertyDTO;
import com.miao.ashop.goods.domain.CategoryProperty;

import java.util.List;

public interface CategoryPropertyService {

    /**
     * 添加类目建议spu属性名
     * @return
     */
    long addSpuProperty(CategoryPropertyDTO categoryPropertyDTO);

    /**
     * 添加类目建议spu规格
     * 1. 带规格分组
     * @return
     */
    long addSpuFormalProperty(CategoryPropertyDTO categoryPropertyDTO);

    /**
     * 添加类目建议sku属性
     * @return
     */
    long addSkuProperty(CategoryPropertyDTO categoryPropertyDTO);

    /**
     * 删除类目建议属性
     * @param id
     * @return
     */
    int deleteCategoryProperty(Long id);

    /**
     * 类目规格属性列表
     * @param categoryId
     * @return
     */
    List<CategoryPropertyDTO> listByCategoryId(Long categoryId);





}
