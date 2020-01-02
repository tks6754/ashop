package com.miao.ashop.goods.service;

import com.miao.ashop.goods.common.dto.SpuMediaDTO;

import java.util.List;

public interface SpuMediaService {

    /**
     * 保存spu媒体信息
     * @param spuMediaDTOList
     */
    void addAllSpuMedia(List<SpuMediaDTO> spuMediaDTOList, Long spuId);

}
