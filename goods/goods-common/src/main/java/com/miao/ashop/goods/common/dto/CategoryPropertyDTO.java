package com.miao.ashop.goods.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CategoryPropertyDTO implements Serializable {

    /**
     *
     */
    private Long id;

    /**
     * 类目id
     */
    private Long categoryId;

    /**
     * 属性名
     */
    private String propertyName;

    /**
     * 属性类型 1:spu-property 2:spu规格 3:sku-property
     */
    private Integer propType;

    /**
     * prop_type=2时，spu规格的分组
     */
    private Long propGroup;

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

    /**
     * 分组名
     */
    private String propGroupName;

}
