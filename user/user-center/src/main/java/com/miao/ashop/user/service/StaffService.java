package com.miao.ashop.user.service;

import com.miao.ashop.user.common.dto.StaffDTO;

/**
 * 员工管理
 */
public interface StaffService {

    /**
     * 新增员工
     * @param staffDTO
     * @return
     */
    long addStaff(StaffDTO staffDTO);

    /**
     * 删除员工
     * @param id
     * @return
     */
    int deleteStaff(Long id);

    /**
     * 更新员工
     * @param staffDTO
     * @return
     */
    int updateStaff(StaffDTO staffDTO);

    /**
     * 获取员工
     * @param id
     * @return
     */
    StaffDTO getStaff(Long id);

}
