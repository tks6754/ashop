package com.miao.ashop.goods.service.impl;

import com.miao.ashop.common.exception.DbException;
import com.miao.ashop.goods.common.dto.CategoryPropertyDTO;
import com.miao.ashop.goods.dao.CategoryPropertyMapper;
import com.miao.ashop.goods.dao.PropertyGroupMapper;
import com.miao.ashop.goods.domain.CategoryProperty;
import com.miao.ashop.goods.domain.PropertyGroup;
import com.miao.ashop.goods.service.CategoryPropertyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryPropertyServiceImpl implements CategoryPropertyService {

    @Autowired
    CategoryPropertyMapper categoryPropertyMapper;

    @Autowired
    PropertyGroupMapper propertyGroupMapper;

    @Override
    public long addSpuProperty(CategoryPropertyDTO categoryPropertyDTO) {
        CategoryProperty categoryProperty = new CategoryProperty();
        BeanUtils.copyProperties(categoryPropertyDTO, categoryProperty);
        categoryProperty.setPropType(1);
        return categoryPropertyMapper.saveCategoryProperty(categoryProperty);
    }

    @Transactional
    @Override
    public long addSpuFormalProperty(CategoryPropertyDTO categoryPropertyDTO) {
        CategoryProperty categoryProperty = new CategoryProperty();
        PropertyGroup propertyGroup = PropertyGroup.builder().propGroupName(categoryPropertyDTO.getPropGroupName()).bizType(categoryPropertyDTO.getBizType()).build();
        propertyGroupMapper.savePropertyGroup(propertyGroup);
        BeanUtils.copyProperties(categoryPropertyDTO, categoryProperty);
        categoryProperty.setPropType(2);
        return categoryPropertyMapper.saveCategoryProperty(categoryProperty);
    }

    @Override
    public long addSkuProperty(CategoryPropertyDTO categoryPropertyDTO) {
        CategoryProperty categoryProperty = new CategoryProperty();
        BeanUtils.copyProperties(categoryPropertyDTO, categoryProperty);
        categoryProperty.setPropType(3);
        return categoryPropertyMapper.saveCategoryProperty(categoryProperty);
    }

    @Override
    public int deleteCategoryProperty(Long id) {
        int ret = categoryPropertyMapper.deleteById(id);
        if (0==ret){
            throw new DbException.DbNotExistException("类目建议属性不存在，categoryProperty.id="+ id);
        }
        return ret;
    }

    @Override
    public List<CategoryPropertyDTO> listByCategoryId(Long categoryId) {
        List<CategoryPropertyDTO> categoryPropertyDTOList = new ArrayList<>();

        List<CategoryProperty> categoryPropertyList = categoryPropertyMapper.listByCategoryId(categoryId);
        if (null!=categoryPropertyList && categoryPropertyList.size()>0){
            for (CategoryProperty categoryProperty : categoryPropertyList) {
                CategoryPropertyDTO categoryPropertyDTO = new CategoryPropertyDTO();
                BeanUtils.copyProperties(categoryProperty, categoryPropertyDTO);
                categoryPropertyDTOList.add(categoryPropertyDTO);
            }
        }
        return categoryPropertyDTOList;
    }
}
