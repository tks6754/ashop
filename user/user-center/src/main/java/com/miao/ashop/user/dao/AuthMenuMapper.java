package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.AuthMenu;

import java.util.List;

/**
* AuthMenuMapper
*
* @author miao
* @created 2019-12-10T22:27:51.954
*/
public interface AuthMenuMapper {

    /**
     *
     * @param authMenu
     * @return
     */
    Long addAuthMenu(AuthMenu authMenu);


    int deleteMenu(Long id);


    int updateMenu(AuthMenu authMenu);



    List<AuthMenu> listAllMenu();

    /**
     *
     * @param id
     * @return
     */
    AuthMenu getById(Long id);


}