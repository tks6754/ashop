package com.miao.ashop.user.common.dto;

import lombok.Data;

import java.util.List;

@Data
public class AuthMenuDTO {

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
     * 页面授权接口
     */
    List<AuthItemDTO> authItemDTOList;

}
