package com.miao.ashop.user.domain;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
* AuthItem 接口权限
*
* @author miao
* @created 2019-12-10T22:27:51.954
*/
@Alias("AuthItem")
@Data
public class AuthItem {
    /**
     * 
     */
    private Long id;

    /**
     * 系统menu id
     */
    private Long menuId;

    /**
     * 请求地址
     */
    private String reqUrl;

    /**
     * 请求方法
     */
    private String reqMethod;

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