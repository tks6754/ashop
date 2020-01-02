package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.util.CollectionUtils;
import com.miao.ashop.goods.common.dto.SpuPropertyDTO;
import com.miao.ashop.goods.dao.SpuPropertyMapper;
import com.miao.ashop.goods.domain.SpuProperty;
import com.miao.ashop.goods.service.SpuPropertyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpuPropertyServiceImpl implements SpuPropertyService {

    @Autowired
    SpuPropertyMapper spuPropertyMapper;

    @Override
    public void addAllSpuProperty(List<SpuPropertyDTO> spuPropertyDTOList, Long spuId) {
        if (CollectionUtils.hasElement(spuPropertyDTOList)){
            List<SpuProperty> spuPropertyList = new ArrayList<>(spuPropertyDTOList.size());
            for (SpuPropertyDTO spuPropertyDTO : spuPropertyDTOList) {
                SpuProperty spuProperty = new SpuProperty();
                BeanUtils.copyProperties(spuPropertyDTO, spuProperty);
                spuProperty.setSpuId(spuId);
            }
            spuPropertyMapper.saveAllSpuProperty(spuPropertyList);
        }
    }
}
