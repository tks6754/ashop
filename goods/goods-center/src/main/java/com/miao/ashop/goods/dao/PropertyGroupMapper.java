package com.miao.ashop.goods.dao;

import com.miao.ashop.goods.domain.PropertyGroup;

/**
* PropertyGroupMapper
*
* @author miao
* @created 2019-12-07T18:28:17.583
*/
public interface PropertyGroupMapper {

    long savePropertyGroup(PropertyGroup propertyGroup);

    int deleteById(Long id);

    int updatePropertyGroup(PropertyGroup propertyGroup);

    PropertyGroup getById(Long id);


}