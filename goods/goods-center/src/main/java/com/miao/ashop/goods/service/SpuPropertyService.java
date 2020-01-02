package com.miao.ashop.goods.service;

import com.miao.ashop.goods.common.dto.SpuPropertyDTO;

import java.util.List;

public interface SpuPropertyService {

    /**
     *
     * @param spuPropertyDTOList
     * @param spuId
     */
    void addAllSpuProperty(List<SpuPropertyDTO> spuPropertyDTOList, Long spuId);

}
