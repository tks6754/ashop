package com.miao.ashop.user.service.impl;

import com.miao.ashop.common.exception.DbException;
import com.miao.ashop.user.common.dto.StaffDTO;
import com.miao.ashop.user.dao.StaffMapper;
import com.miao.ashop.user.domain.Staff;
import com.miao.ashop.user.service.StaffService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffMapper staffMapper;

    @Override
    public long addStaff(StaffDTO staffDTO) {
        Staff staff = new Staff();
        BeanUtils.copyProperties(staffDTO, staff);

        return staffMapper.saveStaff(staff);
    }

    @Override
    public int deleteStaff(Long id) {
        return staffMapper.deleteStaff(id);
    }

    @Override
    public int updateStaff(StaffDTO staffDTO) {
        Staff staff = new Staff();
        BeanUtils.copyProperties(staffDTO, staff);
        return staffMapper.updateStaff(staff);
    }

    @Override
    public StaffDTO getStaff(Long id) {
        StaffDTO staffDTO = new StaffDTO();
        Staff staff = staffMapper.getById(id);
        if (null==staff){
            throw new DbException.DbNotExistException("staff.id="+ id);
        }
        BeanUtils.copyProperties(staff, staffDTO);

        return staffDTO;
    }
}
