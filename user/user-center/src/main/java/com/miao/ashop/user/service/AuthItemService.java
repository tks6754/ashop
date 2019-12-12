package com.miao.ashop.user.service;

import com.miao.ashop.user.common.dto.AuthItemDTO;

import java.util.List;

public interface AuthItemService {

    /**
     *
     * @param authItemDTO
     * @return
     */
    Long addAuthItem(AuthItemDTO authItemDTO);

    /**
     *
     * @param authItemDTO
     */
    void addAuthItemList(List<AuthItemDTO> authItemDTO);

    /**
     *
     * @param id
     * @return
     */
    int deleteAuthItem(long id);


    /**
     *
     * @return
     */
    List<AuthItemDTO> listAllAuthItem();

}
