package com.miao.ashop.goods.service.impl;

import com.miao.ashop.goods.common.dto.ItemSpuDTO;
import com.miao.ashop.goods.dao.*;
import com.miao.ashop.goods.service.ItemSpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemSpuServiceImpl implements ItemSpuService {

    @Autowired
    ItemSpuMapper itemSpuMapper;

    @Autowired
    SpuMediaMapper spuMediaMapper;

    @Autowired
    SpuPropertyMapper spuPropertyMapper;

    @Autowired
    ItemSkuMapper itemSkuMapper;

    @Autowired
    SkuAttrKeyMapper skuAttrKeyMapper;

    @Autowired
    SkuAttrValMapper skuAttrValMapper;


    @Override
    public Long addItemSpu(ItemSpuDTO itemSpuDTO) {
        return null;
    }
}
