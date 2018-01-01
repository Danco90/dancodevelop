package com.daniele.switchyard.v1.module.utilities.prototype.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 
 * @author matteodaniele
 * @update 12/14/2017
 * @version 0.2
 */
@Entity
@Table(name = "ACCOUNT", uniqueConstraints = { @UniqueConstraint(columnNames = { "ID" }) })
public class Account {
	
	@Id 
	@SequenceGenerator(name="account_generator", sequenceName = "seq_account"/*, initialValue = 5, allocationSize = 100*/)
	@GeneratedValue(generator = "account_generator", strategy = GenerationType.SEQUENCE )
	@Column(name = "ID")
	private long id;
	
	@Column(name = "OWNER_NAME")
	private String ownerName;
	
	@Column(name = "ACCT_NUM")
	private long acctNumber;
	
	@Column(name = "BALANCE")
	private double balance;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Account(long id, String ownerName, long acctNumber, double balance) {
		this.id = id;
		this.ownerName = ownerName;
		this.acctNumber = acctNumber;
		this.balance = balance;
	}
	
	public Account(String ownerName, long acctNumber, double balance) {
		this.ownerName = ownerName;
		this.acctNumber = acctNumber;
		this.balance = balance;
	}

	public Account() {
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
