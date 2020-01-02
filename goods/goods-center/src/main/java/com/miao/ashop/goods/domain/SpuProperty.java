package com.miao.ashop.goods.domain;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
* SpuProperty
*
* @author miao
* @created 2019-12-07T18:28:17.584
*/
@Alias("SpuProperty")
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
    private String propName;

    /**
     * 属性值
     */
    private String propValue;

    /**
     * 属性类型 1:属性 2:规格
     */
    private Integer propType;

    /**
     * 规格分组
     */
    private String propGroup;

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