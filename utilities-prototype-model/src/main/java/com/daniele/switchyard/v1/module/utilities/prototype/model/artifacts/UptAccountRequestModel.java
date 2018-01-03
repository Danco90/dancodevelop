package com.daniele.switchyard.v1.module.utilities.prototype.model.artifacts;

import java.io.Serializable;

import com.daniele.switchyard.v1.module.utilities.prototype.model.entities.Account;

/**
 * @company daniele
 * @author daniele
 * @mail danielematteo90@gmail.com
 * @date 1/03/2017
 * @time 22:03
 * @version 0.3
 * 
 */
public class UptAccountRequestModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String channel;
	
	private Account fromAcct;
	private Account toAcct;
	
	public UptAccountRequestModel() {
	}
	
	public UptAccountRequestModel(Account fromAcct, Account toAcct) {
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
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	

}
