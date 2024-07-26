package org.chez_credit.banking_app.service;

import org.chez_credit.banking_app.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
}
