/**
 * 
 */
package com.doj.restapi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doj.restapi.bean.Account;
import com.doj.restapi.service.IAccountService;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class AccountController {
	
	@Autowired
	IAccountService accountService;
	
	@GetMapping("/")
	public String home (){
		return "Spring REST Dinesh on Java!!!";
	}
	
	@GetMapping("/accounts")
	public List<Account> all (){
		return accountService.list();
	}
	
	@PostMapping("/account")
	public Account create (@RequestBody Account account){
		return accountService.create(account);
	}
	
	@GetMapping("/account/{accountId}")
	public Account get (@PathVariable Long accountId){
		return accountService.get(accountId);
	}
	
	@PutMapping("/account/{accountId}")
	public Account update (@RequestBody Account account, @PathVariable Long accountId){
		return accountService.update(account, accountId);
	}
	
	@DeleteMapping("/account/{accountId}")
	public void delete (@PathVariable Long accountId){
		accountService.delete(accountId);
	}
}
