package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.AuthRoleStaff;

/**
* AuthRoleStaffMapper
*
* @author miao
* @created 2019-12-10T22:27:51.955
*/
public interface AuthRoleStaffMapper {

    /**
     * 保存权限分配
     * @param authRoleStaff
     * @return
     */
    long saveAuthRoleStaff(AuthRoleStaff authRoleStaff);

    /**
     * 更新权限分配
     * @param authRoleStaff
     * @return
     */
    int updateAuthRoleStaff(AuthRoleStaff authRoleStaff);

}