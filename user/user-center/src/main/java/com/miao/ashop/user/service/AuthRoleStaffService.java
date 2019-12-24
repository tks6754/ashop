package com.miao.ashop.user.service;

import com.miao.ashop.user.common.dto.AuthRoleStaffDTO;

/**
 * 员工角色分配
 */
public interface AuthRoleStaffService {

    /**
     * 分配角色
     * @param authRoleStaffDTO
     * @return
     */
    long addAuth(AuthRoleStaffDTO authRoleStaffDTO);

    /**
     * 重新分配角色
     * @param authRoleStaffDTO
     * @return
     */
    int updateAuth(AuthRoleStaffDTO authRoleStaffDTO);

}
