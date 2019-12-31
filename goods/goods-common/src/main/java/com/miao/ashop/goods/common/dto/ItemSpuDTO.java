package com.miao.ashop.goods.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class ItemSpuDTO implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 副标题
     */
    private String subtitle;

    /**
     * 主图
     */
    private String mainImg;

    /**
     * 主视频
     */
    private String mainVideo;

    /**
     * seller_id+item_code商家id和商家编码,商家系统的商品唯一码
     */
    private String itemCode;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 售价
     */
    private BigDecimal salePrice;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名
     */
    private String brandName;

    /**
     * 所属类目id
     */
    private Long categoryId;

    /**
     * 所属类目名称
     */
    private String categoryName;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 商品形态 1:实物商品 2:虚拟商品 3:服务商品
     */
    private Integer itemPattern;

    /**
     * 商品类型 1:前端商品 2:后端商品 3:组合商品 4:扩展的商品类型
     */
    private Integer itemType;

    /**
     * 标记位，进行二进制打标操作
     */
    private Long flag;

    /**
     * 扩展字段,json格式
     */
    private String feature;

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
     * spu 头部媒体文件
     */
    List<SpuMediaDTO> spuHeadMediaDTOList;

    /**
     * spu 详情媒体文件
     */
    List<SpuMediaDTO> spuDetailMediaDTOList;

    /**
     *
     */
    List<SpuPropertyDTO> spuPropertyList;

    /**
     *
     */
    List<SpuPropertyDTO> spuSpecificationList;


    /**
     * sku 属性
     */
    List<SkuAttrDTO> skuAttrDTOList;

    /**
     * sku 列表
     */
    List<ItemSkuDTO> itemSkuDTOList;









}
