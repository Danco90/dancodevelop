package com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts;

import java.util.ArrayList;
import java.util.List;
import com.daniele.switchyard.v1.module.utilities.prototype.model.entities.Account;

/**
 * 
 * @author matteodaniele
 * @update 1/03/2018
 * @version 0.3
 */
public class UptResponseModel implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	List<Account> accounts = new ArrayList<>();

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
//	List<Object> codes = new ArrayList<>();
//
//	public List<Object> getCodes() {
//		return codes;
//	}
//
//	public void setCodes(List<Object> codes) {
//		this.codes = codes;
//	}
	
	
	
	
	

}
