package com.miao.ashop.goods.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SkuAttrDTO implements Serializable {
    /**
     * 属性名
     */
    private String attrName;

    /**
     * 所属业务平台
     */
    private String bizType;


    /**
     * 属性值列表
     */
    private List<String> attrValueList;
}
