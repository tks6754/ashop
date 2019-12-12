package com.miao.ashop.user.service;

import com.miao.ashop.user.domain.Account;

public interface AccountService {

    Long saveAccount(Account account);

    int deleteAccount(Long id);

    int updateAccount(Account account);

    Account getById(Long id);

}
