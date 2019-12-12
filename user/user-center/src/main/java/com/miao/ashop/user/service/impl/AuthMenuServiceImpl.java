package com.miao.ashop.user.service.impl;

import com.google.common.collect.Maps;
import com.miao.ashop.user.common.dto.AuthItemDTO;
import com.miao.ashop.user.common.dto.AuthMenuDTO;
import com.miao.ashop.user.dao.AuthMenuMapper;
import com.miao.ashop.user.domain.AuthMenu;
import com.miao.ashop.user.service.AuthItemService;
import com.miao.ashop.user.service.AuthMenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class AuthMenuServiceImpl implements AuthMenuService {

    @Autowired
    AuthMenuMapper authMenuMapper;

    @Autowired
    AuthItemService authItemService;

    @Override
    @Transactional
    public Long addMenu(AuthMenuDTO authMenuDTO) {
        AuthMenu authMenu = new AuthMenu();
        BeanUtils.copyProperties(authMenuDTO, authMenu);
        Long menuId = authMenuMapper.addAuthMenu(authMenu);

        if (authMenuDTO.getAuthItemDTOList()!=null && authMenuDTO.getAuthItemDTOList().size()>0){
            for (AuthItemDTO authItemDTO : authMenuDTO.getAuthItemDTOList()) {
                authItemDTO.setMenuId(menuId);
                authItemService.addAuthItem(authItemDTO);
            }
        }

        return menuId;
    }

    @Override
    public int deleteMenu(Long id) {
        return 0;
    }

    @Override
    @Transactional
    public int updateMenu(AuthMenuDTO authMenuDTO) {
        AuthMenu authMenu = new AuthMenu();
        BeanUtils.copyProperties(authMenuDTO, authMenu);
        int ret = authMenuMapper.updateMenu(authMenu);

        if (authMenuDTO.getAuthItemDTOList()!=null && authMenuDTO.getAuthItemDTOList().size()>0){
            for (AuthItemDTO authItemDTO : authMenuDTO.getAuthItemDTOList()) {
                authItemDTO.setMenuId(authMenu.getId());
                authItemService.updateAuthItem(authItemDTO);
            }
        }
        return ret;
    }

    @Override
    public List<AuthMenuDTO> allAuth() {
        List<AuthItemDTO> authItemDTOList = authItemService.listAllAuthItem();
        Map<Long, List<AuthItemDTO>> authItemMap = Maps.newHashMap();
        for (AuthItemDTO authItemDTO : authItemDTOList) {
            if (authItemMap.get(authItemDTO.getMenuId()) == null){
                authItemMap.put(authItemDTO.getMenuId(), new ArrayList<>());
            }
            authItemMap.get(authItemDTO.getMenuId()).add(authItemDTO);
        }

        List<AuthMenu> authMenuList = authMenuMapper.listAllMenu();
        List<AuthMenuDTO> authMenuDTOList = new ArrayList<>(authMenuList.size());
        for (AuthMenu authMenu : authMenuList) {
            AuthMenuDTO authMenuDTO = new AuthMenuDTO();
            BeanUtils.copyProperties(authMenu, authMenuDTO);
            List<AuthItemDTO> itemDTOList = authItemMap.get(authMenu.getId());
            if (itemDTOList != null){
                Collections.sort(itemDTOList);
                authMenuDTO.setAuthItemDTOList(itemDTOList);
            }

            authMenuDTOList.add(authMenuDTO);
        }


        return authMenuDTOList;
    }

    @Override
    public AuthMenuDTO getAuthMenu(Long id) {
        return null;
    }
}
