package com.miao.ashop.user.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AuthRoleDTO implements Serializable {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角描述
     */
    private String roleDesc;

    /**
     * (接口)权限集合 多个值,号隔开
     */
    private String authSet;

    /**
     * 所属业务平台
     */
    private String bizType;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 页面集合 (内部解析接口集合)
     */
    private List<AuthMenuDTO> authMenuDTOList;

    /**
     * 接口集合
     */
    private List<AuthItemDTO> authItemDTOList;

}
