package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.domain.ItemSku;

import java.util.List;

/**
* ItemSkuMapper
*
* @author miao
* @created 2019-12-07T18:28:17.583
*/
public interface ItemSkuMapper {

    /**
     *
     * @param itemSkuList
     * @return
     */
    int saveAllItemSku(List<ItemSku> itemSkuList);

}