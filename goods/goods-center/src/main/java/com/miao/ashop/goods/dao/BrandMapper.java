package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.common.qto.BrandQTO;
import com.miao.ashop.goods.domain.Brand;

import java.util.List;

/**
* BrandMapper
*
* @author miao
* @created 2019-12-07T18:28:17.580
*/
public interface BrandMapper {

    /**
     * 插入品牌
     * @param brand
     * @return
     */
    long saveBrand(Brand brand);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 更新品牌
     * @param brand
     * @return
     */
    int updateBrand(Brand brand);

    /**
     * 获取指定品牌
     * @param id
     * @return
     */
    Brand getById(Long id);

    /**
     * 品牌列表
     * @param brandQTO
     * @return
     */
    List<Brand> listBrand(BrandQTO brandQTO);

    /**
     * 品牌计数
     * @param brandQTO
     * @return
     */
    long countBrand(BrandQTO brandQTO);
}