package com.miao.ashop.user.domain;

import java.util.Date;
import lombok.Data;

/**
* AuthRole
*
* @author miao
* @created 2019-12-10T22:27:51.955
*/
@Data
public class AuthRole {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角描述
     */
    private String desc;

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
     * 权限集合 多个值,号隔开
     */
    private String authSet;
}