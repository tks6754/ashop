package com.miao.ashop.goods.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* ItemSku
*
* @author miao
* @created 2019-12-07T18:28:17.583
*/
@Data
public class ItemSku {
    /**
     * 
     */
    private Long id;

    /**
     * sku名
     */
    private String skuName;

    /**
     * sku属性code唯一码 十进制占位表示
     */
    private String skuAttrCode;

    /**
     * spu.id
     */
    private Long spuId;

    /**
     * sku图
     */
    private String skuImg;

    /**
     * 库存数
     */
    private Integer qty;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 售价
     */
    private BigDecimal salePrice;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

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