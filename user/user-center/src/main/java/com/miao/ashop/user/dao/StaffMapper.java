package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.Staff;

/**
* StaffMapper
*
* @author miao
* @created 2019-12-10T22:27:51.953
*/
public interface StaffMapper {

    /**
     * 新增员工
     * @param staff
     * @return
     */
    long saveStaff(Staff staff);

    /**
     * 删除员工
     * @param id
     * @return
     */
    int deleteStaff(Long id);

    /**
     * 更新员工
     * @param staff
     * @return
     */
    int updateStaff(Staff staff);

    /**
     * 获取员工详情
     * @param id
     * @return
     */
    Staff getById(Long id);

}