package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.AuthRole;

/**
* AuthRoleMapper
*
* @author miao
* @created 2019-12-10T22:27:51.955
*/
public interface AuthRoleMapper {

    /**
     * 新增角色
     * @param authRole
     * @return
     */
    long saveRole(AuthRole authRole);

    /**
     * 删除角色
     * @param id
     * @return
     */
    int deleteRole(Long id);

    /**
     * 获取角色
     * @param id
     * @return
     */
    AuthRole getById(Long id);


}