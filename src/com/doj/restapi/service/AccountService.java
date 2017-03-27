/**
 * 
 */
package com.doj.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doj.restapi.bean.Account;
import com.doj.restapi.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class AccountService implements IAccountService{
	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account create(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account get(Long accountId) {
		return accountRepository.findOne(accountId);
	}

	@Override
	public Account update(Account account, Long accountId) {
		return accountRepository.save(account);
	}

	@Override
	public void delete(Long accountId) {
		accountRepository.delete(accountId);
	}

	@Override
	public List<Account> list() {
		return (List<Account>) accountRepository.findAll();
	}
}
