package com.miao.ashop.user.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthRoleStaffDTO implements Serializable {

    /**
     *
     */
    private Long id;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 角色集合 多个值,号隔开
     */
    private String roleSet;

    /**
     * 创建人staff_id
     */
    private Long createBy;

    /**
     * 修改人staff_id
     */
    private Long updateBy;

    /**
     * 所属业务平台
     */
    private String bizType;

    /**
     * 版本
     */
    private Integer version;

}
