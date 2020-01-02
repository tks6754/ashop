package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.util.CollectionUtils;
import com.miao.ashop.goods.common.dto.SpuMediaDTO;
import com.miao.ashop.goods.dao.SpuMediaMapper;
import com.miao.ashop.goods.domain.SpuMedia;
import com.miao.ashop.goods.service.SpuMediaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpuMediaServiceImpl implements SpuMediaService {

    @Autowired
    SpuMediaMapper spuMediaMapper;

    @Override
    public void addAllSpuMedia(List<SpuMediaDTO> spuMediaDTOList, Long spuId) {
        if (CollectionUtils.hasElement(spuMediaDTOList)){
            List<SpuMedia> spuMediaList = new ArrayList<>(spuMediaDTOList.size());
            for (SpuMediaDTO spuMediaDTO : spuMediaDTOList) {
                SpuMedia spuMedia = new SpuMedia();
                BeanUtils.copyProperties(spuMediaDTO, spuMedia);
                spuMedia.setSpuId(spuId);
                spuMediaList.add(spuMedia);
            }

            spuMediaMapper.saveAllSpuMedia(spuMediaList);
        }
    }
}
