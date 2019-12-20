package com.miao.ashop.user.service;

import com.miao.ashop.user.common.dto.AuthRoleDTO;

import java.util.List;

/**
 * 角色管理
 */
public interface AuthRoleService {

    /**
     * 新增角色
     * @param authRoleDTO
     * @return
     */
    long addRole(AuthRoleDTO authRoleDTO);

    /**
     * 删除角色
     * @param id
     * @return
     */
    int deleteRole(Long id);

    /**
     * 更新角色
     * @param authRoleDTO
     * @return
     */
    int updateRole(AuthRoleDTO authRoleDTO);

    /**
     * 获取角色
     * @param id
     * @return
     */
    AuthRoleDTO getRole(Long id);

    /**
     * 获取所有角色
     * @return
     */
    List<AuthRoleDTO> listAllRole();




}
