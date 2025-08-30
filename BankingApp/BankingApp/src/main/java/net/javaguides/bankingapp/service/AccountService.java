package net.javaguides.bankingapp.service;

import net.javaguides.bankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(long id);

    AccountDto deposit(long id, double amount);

    AccountDto withdraw(long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(long id);

}
