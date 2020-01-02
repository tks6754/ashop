package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.util.CollectionUtils;
import com.miao.ashop.goods.common.dto.ItemSpuDTO;
import com.miao.ashop.goods.dao.*;
import com.miao.ashop.goods.domain.ItemSpu;
import com.miao.ashop.goods.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ItemSpuServiceImpl implements ItemSpuService {

    @Autowired
    ItemSpuMapper itemSpuMapper;

    @Autowired
    SpuMediaService spuMediaService;

    @Autowired
    SpuPropertyService spuPropertyService;

    @Autowired
    ItemSkuService itemSkuService;

    @Autowired
    SkuAttrService skuAttrService;



    @Override
    @Transactional
    public Long addItemSpu(ItemSpuDTO itemSpuDTO) {
        String mainImg = null;
        String mainVideo = null;

        // 至少有一个主图，可以没有视频；有视频，放在最后一个元素
        if (CollectionUtils.hasElement(itemSpuDTO.getSpuHeadMediaDTOList())){
            if (itemSpuDTO.getSpuHeadMediaDTOList().get(0).getMediaType().intValue()==1){
                mainImg = itemSpuDTO.getSpuHeadMediaDTOList().get(0).getMediaUrl();
            }
            if (itemSpuDTO.getSpuHeadMediaDTOList().get(itemSpuDTO.getSpuHeadMediaDTOList().size()-1).getMediaType().intValue()==2){
                mainVideo = itemSpuDTO.getSpuHeadMediaDTOList().get(itemSpuDTO.getSpuHeadMediaDTOList().size()-1).getMediaUrl();
            }
        }

        ItemSpu itemSpu = new ItemSpu();
        BeanUtils.copyProperties(itemSpuDTO, itemSpu);
        itemSpu.setMainImg(mainImg);
        itemSpu.setMainVideo(mainVideo);
        long spuId = itemSpuMapper.saveItemSpu(itemSpu);


        // spu 头部媒体文件 保存
        if (CollectionUtils.hasElement(itemSpuDTO.getSpuHeadMediaDTOList())){
            spuMediaService.addAllSpuMedia(itemSpuDTO.getSpuHeadMediaDTOList(), spuId);
        }

        // spu 详情媒体文件 保存
        if (CollectionUtils.hasElement(itemSpuDTO.getSpuDetailMediaDTOList())){
            spuMediaService.addAllSpuMedia(itemSpuDTO.getSpuDetailMediaDTOList(), spuId);
        }

        // spu 属性 保存
        if (CollectionUtils.hasElement(itemSpuDTO.getSpuPropertyList())){
            spuPropertyService.addAllSpuProperty(itemSpuDTO.getSpuPropertyList(), spuId);
        }

        // spu 规格 保存
        if (CollectionUtils.hasElement(itemSpuDTO.getSpuSpecificationList())){
            spuPropertyService.addAllSpuProperty(itemSpuDTO.getSpuSpecificationList(), spuId);
        }

        // sku 属性 保存
        if (CollectionUtils.hasElement(itemSpuDTO.getSkuAttrDTOList())){
            skuAttrService.addAllSkuAttr(itemSpuDTO.getSkuAttrDTOList(), spuId);
        }

        // sku 列表 保存
        if (CollectionUtils.hasElement(itemSpuDTO.getItemSkuDTOList())){
            itemSkuService.addAllItemSku(itemSpuDTO.getItemSkuDTOList(), spuId);
        }

        return spuId;
    }
}
