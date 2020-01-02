package com.miao.ashop.goods.service;

import com.miao.ashop.goods.common.dto.ItemSkuDTO;

import java.util.List;

public interface ItemSkuService {

    /**
     *
     * @param itemSkuDTOList
     */
    void addAllItemSku(List<ItemSkuDTO> itemSkuDTOList, Long spuId);

}
