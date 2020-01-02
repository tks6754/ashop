package com.miao.ashop.user.domain;

import java.util.Date;
import lombok.Data;

/**
* PlatformAccount
*
* @author miao
* @created 2019-12-10T22:27:51.952
*/
@Data
public class PlatformAccount {
    /**
     * 
     */
    private Long id;

    /**
     * 账号id
     */
    private Long uid;

    /**
     * 平台id
     */
    private String platformId;

    /**
     * 平台access_token
     */
    private String platformToken;

    /**
     * 平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter
     */
    private Integer type;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatar;

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