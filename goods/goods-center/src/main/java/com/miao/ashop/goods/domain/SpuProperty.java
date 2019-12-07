package com.miao.ashop.goods.domain;

import java.util.Date;
import lombok.Data;

/**
* SpuProperty
*
* @author miao
* @created 2019-12-07T18:28:17.584
*/
@Data
public class SpuProperty {
    /**
     * 
     */
    private Long id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 属性名
     */
    private String propertyName;

    /**
     * 属性值
     */
    private String propertyValue;

    /**
     * 所属业务平台
     */
    private String bizType;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 逻辑删除 0:未删除 1:已删除
     */
    private Integer isDeleted;
}