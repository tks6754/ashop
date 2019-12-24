package com.miao.ashop.user.service;

import com.miao.ashop.user.common.dto.AccountDTO;

public interface AccountService {

    /**
     * 新增账户
     * @param accountDTO
     * @return
     */
    Long saveAccount(AccountDTO accountDTO);

    /**
     * 删除账户
     * @param id
     * @return
     */
    int deleteAccount(Long id);

    /**
     * 更新账户
     * @param accountDTO
     * @return
     */
    int updateAccount(AccountDTO accountDTO);

    /**
     * 获取账户
     * @param id
     * @return
     */
    AccountDTO getById(Long id);

}
