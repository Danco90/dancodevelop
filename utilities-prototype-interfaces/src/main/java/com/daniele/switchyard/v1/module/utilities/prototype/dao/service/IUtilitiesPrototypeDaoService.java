package com.daniele.switchyard.v1.module.utilities.prototype.dao.service;

import com.daniele.switchyard.v1.module.utilities.prototype.dto.BaseDto;
import com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts.UptResponseModel;


/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/04/2018
 * @time 17:55
 * @version 0.6.1
 * 
 */
public interface IUtilitiesPrototypeDaoService {
	
//	BaseDto<UptResponseModel> genKey(BaseDto<UptRequestModel> request);
	BaseDto<UptResponseModel> listAccount();

	//Account updateAccount(Account to) throws AccountMovementException;
	
    //List<Account> updateAccounts(Account from, Account to) throws AccountMovementException;
	
//	List<UptAccountRequestModel> listAccount() throws Exception;
//	List<UptAccountResponsetModel> listAccount() throws Exception;
	 
	//Account getAccount(long id) throws AccountNotFoundException;
	  
	//void createAccount(Account account) throws Exception;  
	
	//void deleteAccount(Account account) throws Exception;

}
