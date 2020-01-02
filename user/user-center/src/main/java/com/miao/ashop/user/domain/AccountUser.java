package com.miao.ashop.user.domain;

import java.util.Date;
import lombok.Data;

/**
* AccountUser
*
* @author miao
* @created 2019-12-10T22:27:51.952
*/
@Data
public class AccountUser {
    /**
     * 
     */
    private Long id;

    /**
     * 账号id
     */
    private Long uid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像(相对路径)
     */
    private String avatar;

    /**
     * 性别 1:male 2:female 0:unknow)
     */
    private Integer gender;

    /**
     * 角色 0:普通用户 1:vip
     */
    private Integer role;

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