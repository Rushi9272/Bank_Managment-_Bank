package com.app.dto;

import java.util.Scanner;


import com.app.model.User;
import com.app.model.AccountOpen;

public class InputRequest {
	static  Scanner sn=new Scanner(System.in);
 public static User register() {
	
	 System.out.println("Enter User Details:");
	 System.out.println("Enter user first name:");
	 String fname=sn.next();
	 System.out.println("Enter user Last name:");
	 String lname=sn.next();
	 System.out.println("Enter user address:");
	 String address=sn.next();
	 System.out.println("Enter user mobile:");
	 String mob=sn.next();
	 System.out.println("Enter user  name:");
	 String uname=sn.next();
	 System.out.println("Enter user password:");
	 String pass=sn.next();
	 System.out.println("Enter user role:");
	 String role=sn.next();
	return addUser(fname, lname, address, mob, uname, pass, role);
	 
 }
 private static User addUser(String fname, String lname, String address, String mob, String uname, String pass,
			String role) {
		User user=new User();
		 user.setAddress(address);
		 user.setFisrtName(fname);
		 user.setLastName(lname);
		 user.setMobile(mob);
		 user.setPassword(pass);
		 user.setRole(role);
		 user.setUname(uname);
		 return user;
	}
public static UserRequest login() {
	System.out.println("Enter user  name:");
	 String uname=sn.next();
	 System.out.println("Enter user password:");
	 String pass=sn.next();
	 System.out.println("Enter user role:");
	 String role=sn.next();
	 return new UserRequest(uname,pass,role);
 }

public static AccountOpen open() {
	// TODO Auto-generated method stub
	System.out.println("Enter  Account Holder First Name:");
	String aFirstName=sn.next();
	System.out.println("Enter  Account Holder Last Name:");
	String aLastName=sn.next();
	System.out.println("Enter Account Holder Address:");
	String aAddress=sn.next();
	System.out.println("Enter Account Holder Phone Number:");
	long aPhoneNo=sn.nextLong();
	System.out.println("Enter Account Holder PAN Number:");
	String aPanNo=sn.next();
	long accountNumber= aPhoneNo;
	System.out.println("Account Open Succefully");
	System.out.println("Your Account Number is" +accountNumber );
	return addOpen(aFirstName,aLastName,aAddress,aPhoneNo,aPanNo,accountNumber) ;
	
}
private static AccountOpen addOpen(String aFirstName,String aLastName,String aAddress, long aPhoneNo,String aPanNo,long accountNumber) {
	AccountOpen accountOpen = new AccountOpen();
	accountOpen.setAccountHolderFirstName(aFirstName);
	accountOpen.setAccountHolderLastName(aLastName);
	accountOpen.setAccountHolderAddress(aAddress);
	accountOpen.setAccountHolderPhoneNumber(aPhoneNo);
	accountOpen.setAccountHolderPanNumber(aPanNo);
	accountOpen.setAccountHolderAccountNumber(accountNumber);
	return accountOpen;
}

/*public static FundTransfer addFundTransfer() {
	// TODO Auto-generated method stub
	System.out.println("Enter Your  First Name:");
	String cFirstName=sn.next();
	System.out.println("Enter Your  Last Name:");
	String cLastName=sn.next();
	System.out.println("Enter Your  Account Number:");
	String accountNo=sn.next();
	return addFundTransfer() ;
}*/

}

