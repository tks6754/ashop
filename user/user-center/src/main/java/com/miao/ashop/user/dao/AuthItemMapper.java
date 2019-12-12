package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.AuthItem;

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

}