package com.miao.ashop.user.domain;

import java.util.Date;
import lombok.Data;

/**
* AuthRoleStaff 员工授权角色
*
* @author miao
* @created 2019-12-10T22:27:51.955
*/
@Data
public class AuthRoleStaff {
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

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 逻辑删除 0:未删除 1:已删除
     */
    private Integer isDeleted;
}