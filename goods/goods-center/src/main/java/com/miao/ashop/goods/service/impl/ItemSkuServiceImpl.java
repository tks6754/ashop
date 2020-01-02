package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.util.CollectionUtils;
import com.miao.ashop.goods.common.dto.ItemSkuDTO;
import com.miao.ashop.goods.dao.ItemSkuMapper;
import com.miao.ashop.goods.domain.ItemSku;
import com.miao.ashop.goods.service.ItemSkuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemSkuServiceImpl implements ItemSkuService {

    @Autowired
    ItemSkuMapper itemSkuMapper;

    @Override
    public void addAllItemSku(List<ItemSkuDTO> itemSkuDTOList, Long spuId) {
        if (CollectionUtils.hasElement(itemSkuDTOList)){
            List<ItemSku> itemSkuList = new ArrayList<>();
            for (ItemSkuDTO itemSkuDTO : itemSkuDTOList) {
                ItemSku itemSku = new ItemSku();
                BeanUtils.copyProperties(itemSkuDTO, itemSku);
                itemSku.setSpuId(spuId);
            }
            itemSkuMapper.saveAllItemSku(itemSkuList);
        }
    }
}
