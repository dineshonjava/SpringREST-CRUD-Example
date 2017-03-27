/**
 * 
 */
package com.doj.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.doj.restapi.bean.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository extends CrudRepository<Account, Long> {

}
