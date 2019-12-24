package com.miao.ashop.user.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AccountDTO implements Serializable {

    /**
     * 账号id
     */
    private Long id;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建ip
     */
    private String createIpAt;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginAt;

    /**
     * 最后一次登录ip
     */
    private String lastLoginIpAt;

    /**
     * 登录次数
     */
    private Integer loginTimes;

    /**
     * 所属业务平台
     */
    private String bizType;

    /**
     * 版本
     */
    private Integer version;

}
