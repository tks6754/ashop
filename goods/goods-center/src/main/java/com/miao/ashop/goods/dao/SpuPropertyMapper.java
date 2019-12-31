package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.domain.SpuProperty;

/**
* SpuPropertyMapper
*
* @author miao
* @created 2019-12-07T18:28:17.584
*/
public interface SpuPropertyMapper {

    /**
     *
     * @param spuProperty
     * @return
     */
    long saveSpuProperty(SpuProperty spuProperty);

}