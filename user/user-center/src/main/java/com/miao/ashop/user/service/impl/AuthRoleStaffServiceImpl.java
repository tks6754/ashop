package com.miao.ashop.user.service.impl;

import com.miao.ashop.user.common.dto.AuthRoleStaffDTO;
import com.miao.ashop.user.dao.AuthRoleStaffMapper;
import com.miao.ashop.user.domain.AuthRoleStaff;
import com.miao.ashop.user.service.AuthRoleStaffService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthRoleStaffServiceImpl implements AuthRoleStaffService {

    @Autowired
    AuthRoleStaffMapper authRoleStaffMapper;

    @Override
    public long addAuth(AuthRoleStaffDTO authRoleStaffDTO) {
        AuthRoleStaff authRoleStaff = new AuthRoleStaff();
        BeanUtils.copyProperties(authRoleStaffDTO, authRoleStaff);

        return authRoleStaffMapper.saveAuthRoleStaff(authRoleStaff);
    }

    @Override
    public int updateAuth(AuthRoleStaffDTO authRoleStaffDTO) {
        AuthRoleStaff authRoleStaff = new AuthRoleStaff();
        BeanUtils.copyProperties(authRoleStaffDTO, authRoleStaff);

        return authRoleStaffMapper.updateAuthRoleStaff(authRoleStaff);
    }
}
