/**
 * 
 */
package com.doj.restapi.service;

import java.util.List;

import com.doj.restapi.bean.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface IAccountService {
	
	Account create(Account account);
	Account get(Long accountId);
	List<Account> list();
	Account update(Account account, Long accountId);
	void delete(Long accountId);
}
