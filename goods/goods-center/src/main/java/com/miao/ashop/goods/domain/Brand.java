package com.miao.ashop.goods.domain;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
* Brand
*
* @author miao
* @created 2019-12-07T18:28:17.578
*/
@Alias("Brand")
@Data
public class Brand {
    /**
     * 
     */
    private Long id;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 图片链接
     */
    private String pictureUrl;

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