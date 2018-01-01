package com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts;

import java.io.Serializable;

import com.daniele.switchyard.v1.module.utilities.prototype.model.entities.Account;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 12/14/2017
 * @time 23:43
 * @version 0.2
 * 
 */
public class UptAccountResponseModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Account fromAcct;
	private Account toAcct;
	
	public UptAccountResponseModel() {
	}
	
	public UptAccountResponseModel(Account fromAcct, Account toAcct) {
		super();
		this.fromAcct = fromAcct;
		this.toAcct = toAcct;
	}

	public Account getFromAcct() {
		return fromAcct;
	}
	
	public void setFromAcct(Account fromAcct) {
		this.fromAcct = fromAcct;
	}
	public Account getToAcct() {
		return toAcct;
	}
	public void setToAcct(Account toAcct) {
		this.toAcct = toAcct;
	}
	

}
