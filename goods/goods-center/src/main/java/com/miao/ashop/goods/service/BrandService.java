package com.miao.ashop.goods.service;


import com.miao.ashop.goods.common.dto.BrandDTO;
import com.miao.ashop.goods.common.qto.BrandQTO;

import java.util.List;

/**
 * 品牌服务
 */
public interface BrandService {

    /**
     * 添加品牌
     * @param brandDTO
     * @return
     */
    long addBrand(BrandDTO brandDTO);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 更新品牌
     */
    int updateBrand(BrandDTO brandDTO);

    /**
     * 获取品牌
     * @param id
     * @return
     */
    BrandDTO getBrand(Long id);

    /**
     * 获取品牌列表
     * @param brandQTO
     * @return
     */
    List<BrandDTO> listBrand(BrandQTO brandQTO);

    /**
     * 品牌计数
     * @param brandQTO
     * @return
     */
    long countBrand(BrandQTO brandQTO);

}
