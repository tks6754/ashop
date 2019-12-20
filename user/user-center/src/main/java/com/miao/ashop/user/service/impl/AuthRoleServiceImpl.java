package com.miao.ashop.user.service.impl;

import com.miao.ashop.user.common.dto.AuthMenuDTO;
import com.miao.ashop.user.common.dto.AuthRoleDTO;
import com.miao.ashop.user.dao.AuthRoleMapper;
import com.miao.ashop.user.domain.AuthRole;
import com.miao.ashop.user.service.AuthMenuService;
import com.miao.ashop.user.service.AuthRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthRoleServiceImpl implements AuthRoleService {

    @Autowired
    AuthRoleMapper authRoleMapper;

    @Autowired
    AuthMenuService authMenuService;

    @Override
    @Transactional
    public long addRole(AuthRoleDTO authRoleDTO) {
        AuthRole authRole = new AuthRole();
        BeanUtils.copyProperties(authRoleDTO, authRole);

        return authRoleMapper.saveRole(authRole);
    }

    @Override
    public int deleteRole(Long id) {
        return authRoleMapper.deleteRole(id);
    }

    @Override
    public int updateRole(AuthRoleDTO authRoleDTO) {
        return 0;
    }

    @Override
    public AuthRoleDTO getRole(Long id) {
        AuthRoleDTO authRoleDTO = new AuthRoleDTO();
        AuthRole authRole = authRoleMapper.getById(id);
        BeanUtils.copyProperties(authRoleDTO, authRole);

        List<Long> menuIdList = parseIdSet(authRoleDTO.getAuthSet());
        List<AuthMenuDTO> authMenuDTOList = authMenuService.listMenuByIdList(menuIdList);
        authRoleDTO.setAuthMenuDTOList(authMenuDTOList);

        return authRoleDTO;
    }

    @Override
    public List<AuthRoleDTO> listAllRole() {
        return null;
    }


    /**
     * 解析idSet
     * @param idSetStr
     * @return
     */
    private List<Long> parseIdSet(String idSetStr){
        List<Long> idList = new ArrayList<>();
        String[] idArr = idSetStr.split(",");
        if (idArr.length>0){
            for (String idStr : idArr) {
                idList.add(Long.parseLong(idSetStr));
            }
        }

        return idList;
    }

}
