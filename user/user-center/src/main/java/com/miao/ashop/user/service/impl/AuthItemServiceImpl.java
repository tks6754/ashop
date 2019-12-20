package com.miao.ashop.user.service.impl;

import com.miao.ashop.user.common.dto.AuthItemDTO;
import com.miao.ashop.user.dao.AuthItemMapper;
import com.miao.ashop.user.domain.AuthItem;
import com.miao.ashop.user.service.AuthItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthItemServiceImpl implements AuthItemService {

    @Autowired
    AuthItemMapper authItemMapper;

    @Override
    public Long addAuthItem(AuthItemDTO authItemDTO) {
        AuthItem authItem = new AuthItem();
        BeanUtils.copyProperties(authItemDTO, authItem);
        return authItemMapper.saveAuthItem(authItem);
    }

    @Override
    @Transactional
    public void addAuthItemList(List<AuthItemDTO> authItemDTO) {
        if (authItemDTO!=null && authItemDTO.size()>0){
            for (AuthItemDTO itemDTO : authItemDTO) {
                addAuthItem(itemDTO);
            }
        }
    }

    @Override
    public int deleteAuthItem(long id) {
        return authItemMapper.deleteAuthItem(id);
    }

    @Override
    public int deleteAuthByMenu(Long menuId) {
        return authItemMapper.deleteByMenu(menuId);
    }

    @Override
    public void updateAuthItem(AuthItemDTO authItemDTO) {
        if (null == authItemDTO.getId()){
            addAuthItem(authItemDTO);
        }else {
            AuthItem authItem = new AuthItem();
            BeanUtils.copyProperties(authItemDTO, authItem);
            authItemMapper.updateById(authItem);
        }

    }

    @Override
    public List<AuthItemDTO> listAllAuthItem() {
        return null;
    }


    @Override
    public List<AuthItemDTO> listAuthItemByMenu(Long menuId) {
        List<AuthItemDTO> authItemDTOList = new ArrayList<>();

        List<AuthItem> authItemList = authItemMapper.listByMenu(menuId);
        if (authItemList!=null && authItemList.size()>0){
            for (AuthItem authItem : authItemList) {
                AuthItemDTO authItemDTO = new AuthItemDTO();
                BeanUtils.copyProperties(authItem, authItemDTO);
                authItemDTOList.add(authItemDTO);
            }
        }
        return authItemDTOList;
    }
}
