package com.miao.ashop.user.domain;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
* AuthMenu 页面权限
*
* @author miao
* @created 2019-12-10T22:27:51.954
*/
@Data
@Alias("AuthMenu")
public class AuthMenu {
    /**
     * 
     */
    private Long id;

    /**
     * 父菜单id
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜描述
     */
    private String menuDesc;

    /**
     * 菜单uri
     */
    private String menuUri;

    /**
     * 是否展示菜单 1:展示 0:不展示
     */
    private Integer isShow;

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