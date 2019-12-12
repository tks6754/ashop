package com.miao.ashop.user.common.dto;

import lombok.Data;

/**
 *
 */

@Data
public class AuthItemDTO implements Comparable<AuthItemDTO> {

    /**
     *
     */
    private Long id;

    /**
     * 系统menu id
     */
    private Long menuId;

    /**
     * 请求地址
     */
    private String reqUrl;

    /**
     * 请求方法
     */
    private String reqMethod;

    /**
     * 所属业务平台
     */
    private String bizType;

    /**
     * 版本
     */
    private Integer version;


    @Override
    public int compareTo(AuthItemDTO o) {
        if (id < o.getId()){
            return -1;
        }else if (id > o.getId()){
            return 1;
        }else {
            return 0;
        }
    }
}
