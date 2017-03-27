/**
 * 
 */
package com.doj.restapi.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Entity
@Table
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	public Long accountId;
	public String name;
	public String city;
	public Double balance;
	
	public Account() {
		super();
	}
	public Account(String name, String city, Double balance) {
		super();
		this.name = name;
		this.city = city;
		this.balance = balance;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", city=" + city + ", balance=" + balance + "]";
	}
	
}
