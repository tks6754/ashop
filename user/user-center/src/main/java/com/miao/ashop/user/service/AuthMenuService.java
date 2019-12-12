package com.miao.ashop.user.service;

import com.miao.ashop.user.common.dto.AuthMenuDTO;

import java.util.List;

public interface AuthMenuService {

    /**
     * 新增授权页
     * @param authMenuDTO
     * @return
     */
    Long addMenu(AuthMenuDTO authMenuDTO);

    /**
     *
     * @param id
     * @return
     */
    int deleteMenu(Long id);

    /**
     *
     * @return
     */
    List<AuthMenuDTO> allAuth();

    /**
     * 获取详情
     * @param id
     * @return
     */
    AuthMenuDTO getAuthMenu(Long id);



}
