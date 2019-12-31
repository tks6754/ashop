package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.domain.SpuMedia;

/**
* SpuMediaMapper
*
* @author miao
* @created 2019-12-07T18:28:17.584
*/
public interface SpuMediaMapper {

    /**
     * 添加spu媒体信息
     * @param spuMedia
     * @return
     */
    long saveSpuMedia(SpuMedia spuMedia);
}