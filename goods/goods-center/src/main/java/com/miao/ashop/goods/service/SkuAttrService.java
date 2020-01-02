package com.miao.ashop.goods.service;

import com.miao.ashop.goods.common.dto.SkuAttrDTO;

import java.util.List;

public interface SkuAttrService {

    /**
     *
     * @param skuAttrDTOList
     * @param spuId
     */
    void addAllSkuAttr(List<SkuAttrDTO> skuAttrDTOList, Long spuId);

}
