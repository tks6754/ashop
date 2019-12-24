package com.miao.ashop.user.service.impl;

import com.miao.ashop.user.common.dto.AccountDTO;
import com.miao.ashop.user.dao.AccountMapper;
import com.miao.ashop.user.domain.Account;
import com.miao.ashop.user.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Override
    public Long saveAccount(AccountDTO accountDTO) {
        Account account = new Account();
        BeanUtils.copyProperties(accountDTO, account);

        return accountMapper.saveAccount(account);
    }

    @Override
    public int deleteAccount(Long id) {
        return accountMapper.deleteAccount(id);
    }

    @Override
    public int updateAccount(AccountDTO accountDTO) {
        Account account = new Account();
        BeanUtils.copyProperties(accountDTO, account);

        return accountMapper.updateAccount(account);
    }

    @Override
    public AccountDTO getById(Long id) {
        AccountDTO accountDTO = new AccountDTO();
        Account account = accountMapper.getById(id);
        BeanUtils.copyProperties(accountDTO, account);

        return accountDTO;
    }
}
