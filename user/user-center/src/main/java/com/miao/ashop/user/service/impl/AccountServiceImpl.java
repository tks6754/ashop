package com.miao.ashop.user.service.impl;

import com.miao.ashop.user.domain.Account;
import com.miao.ashop.user.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public Long saveAccount(Account account) {
        return null;
    }

    @Override
    public int deleteAccount(Long id) {
        return 0;
    }

    @Override
    public int updateAccount(Account account) {
        return 0;
    }

    @Override
    public Account getById(Long id) {
        return null;
    }
}
