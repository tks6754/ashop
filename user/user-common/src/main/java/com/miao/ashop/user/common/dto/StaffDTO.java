package com.miao.ashop.user.common.dto;

import java.io.Serializable;

public class StaffDTO implements Serializable {

    /**
     *
     */
    private Long id;

    /**
     * 账号id
     */
    private Long uid;

    /**
     * 员工邮箱
     */
    private String email;

    /**
     * 员工手机号
     */
    private String phone;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工昵称
     */
    private String nickname;

    /**
     * 员工头像(相对路径)
     */
    private String avatar;

    /**
     * 性别 1:male 2:female 0:unknow)
     */
    private Integer gender;

    /**
     * 所属业务平台
     */
    private String bizType;

    /**
     * 版本
     */
    private Integer version;

}
