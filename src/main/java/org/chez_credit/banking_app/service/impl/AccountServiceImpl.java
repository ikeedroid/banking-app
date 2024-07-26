package org.chez_credit.banking_app.service.impl;

import org.chez_credit.banking_app.dto.AccountDto;
import org.chez_credit.banking_app.repository.AccountRepository;
import org.chez_credit.banking_app.service.AccountService;
import org.springframework.stereotype.Service;
@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;
    public AccountServiceImpl (AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override 
    public AccountDto createAccount(AccountDto accountDto){
        return null; 
    }
}
