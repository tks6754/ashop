package com.miao.ashop.user.dao;

import com.miao.ashop.user.domain.Account;

/**
* AccountMapper
*
* @author miao
* @created 2019-12-10T22:27:51.949
*/
public interface AccountMapper {

    /**
     * 新增账户
     * @param account
     * @return
     */
    long saveAccount(Account account);

    /**
     * 删除账户
     * @param id
     * @return
     */
    int deleteAccount(Long id);

    /**
     * 更新账户
     * @param account
     * @return
     */
    int updateAccount(Account account);

    /**
     * 获取账户
     * @param id
     * @return
     */
    Account getById(Long id);

}