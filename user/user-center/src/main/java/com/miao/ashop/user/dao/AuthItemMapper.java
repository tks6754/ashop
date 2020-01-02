package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.AuthItem;

import java.util.List;

/**
* AuthItemMapper
*
* @author miao
* @created 2019-12-10T22:27:51.954
*/
public interface AuthItemMapper {

    /**
     *
     * @param authItem
     * @return
     */
    Long saveAuthItem(AuthItem authItem);

    /**
     *
     * @param id
     * @return
     */
    int deleteAuthItem(Long id);

    /**
     * 删除menu下所有接口权限
     * @param menuId
     * @return
     */
    int deleteByMenu(Long menuId);

    /**
     *
     * @param authItem
     * @return
     */
    int updateById(AuthItem authItem);

    /**
     * 获取menu下所有接口权限
     * @param menuId
     * @return
     */
    List<AuthItem> listByMenu(Long menuId);

}