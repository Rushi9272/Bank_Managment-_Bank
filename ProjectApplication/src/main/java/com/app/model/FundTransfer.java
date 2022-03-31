package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FundTransfer {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private String customrFirstName;
private String customrLastName;
private long custmorAccountNo;
public String getCustomrFirstName() {
	return customrFirstName;
}
public void setCustomrFirstName(String customrFirstName) {
	this.customrFirstName = customrFirstName;
}
public String getCustomrLastName() {
	return customrLastName;
}
public void setCustomrLastName(String customrLastName) {
	this.customrLastName = customrLastName;
}
public long getCustmorAccountNo() {
	return custmorAccountNo;
}
public void setCustmorAccountNo(long custmorAccountNo) {
	this.custmorAccountNo = custmorAccountNo;
}
@Override
public String toString() {
	return "FundTransfer [customrFirstName=" + customrFirstName + ", customrLastName=" + customrLastName
			+ ", custmorAccountNo=" + custmorAccountNo + "]";
}
}