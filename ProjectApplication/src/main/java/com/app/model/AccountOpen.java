package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountOpen {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	String accountHolderFirstName;
	String accountHolderLastName;
	String accountHolderAddress;
	long accountHolderPhoneNumber;
	String accountHolderPanNumber;
	long accountHolderAccountNumber;
	public String getAccountHolderFirstName() {
		return accountHolderFirstName;
	}
	public void setAccountHolderFirstName(String accountHolderFirstName) {
		this.accountHolderFirstName = accountHolderFirstName;
	}
	public String getAccountHolderLastName() {
		return accountHolderLastName;
	}
	public void setAccountHolderLastName(String accountHolderLastName) {
		this.accountHolderLastName = accountHolderLastName;
	}
	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}
	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}
	public long getAccountHolderPhoneNumber() {
		return accountHolderPhoneNumber;
	}
	public void setAccountHolderPhoneNumber(long aPhoneNo) {
		this.accountHolderPhoneNumber = aPhoneNo;
	}
	public String getAccountHolderPanNumber() {
		return accountHolderPanNumber;
	}
	public void setAccountHolderPanNumber(String accountHolderPanNumber) {
		this.accountHolderPanNumber = accountHolderPanNumber;
	}
	public long getAccountHolderAccountNumber() {
		return accountHolderAccountNumber;
	}
	public void setAccountHolderAccountNumber(long accountHolderAccountNumber) {
		this.accountHolderAccountNumber = accountHolderAccountNumber;
	}
	public AccountOpen(String accountHolderFirstName, String accountHolderLastName, String accountHolderAddress,
			long accountHolderPhoneNumber, String accountHolderPanNumber, long accountHolderAccountNumber) {
		super();
		this.accountHolderFirstName = accountHolderFirstName;
		this.accountHolderLastName = accountHolderLastName;
		this.accountHolderAddress = accountHolderAddress;
		this.accountHolderPhoneNumber = accountHolderPhoneNumber;
		this.accountHolderPanNumber = accountHolderPanNumber;
		this.accountHolderAccountNumber = accountHolderAccountNumber;
	}
	@Override
	public String toString() {
		return "AccountOpen [accountHolderFirstName=" + accountHolderFirstName + ", accountHolderLastName="
				+ accountHolderLastName + ", accountHolderAddress=" + accountHolderAddress
				+ ", accountHolderPhoneNumber=" + accountHolderPhoneNumber + ", accountHolderPanNumber="
				+ accountHolderPanNumber + ", accountHolderAccountNumber=" + accountHolderAccountNumber + "]";
	}
	public AccountOpen() {
		super();
		// TODO Auto-generated constructor stub
	}
}