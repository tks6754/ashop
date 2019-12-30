package com.miao.ashop.goods.domain;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
* Category
*
* @author miao
* @created 2019-12-07T18:28:17.582
*/
@Alias("Category")
@Data
public class Category {
    /**
     * 
     */
    private Long id;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目层级
     */
    private Integer level;

    /**
     * 父类目id
     */
    private Long parentId;

    /**
     * 类目类型 1:前台 2:后台
     */
    private Integer cateType;

    /**
     * 图片链接
     */
    private String pictureUrl;

    /**
     * 后台类目集合
     */
    private String backCategory;

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