package com.miao.ashop.goods.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SpuMediaDTO implements Serializable {

    /**
     *
     */
    private Long id;

    /**
     * spu id
     */
    private Long spuId;

    /**
     * 图片链接
     */
    private String mediaUrl;

    /**
     * 图片类型 1:图 2:视频
     */
    private Integer mediaType;

    /**
     * 图片类型
     */
    private Integer imgType;

    /**
     * 图片顺序 默认为0不排序，起始排序从1开始
     */
    private Integer seqNum;

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
