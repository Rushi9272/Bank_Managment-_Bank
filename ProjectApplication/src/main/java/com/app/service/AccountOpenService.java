package com.app.service;

import com.app.dto.CustomerRequest;
import com.app.dto.InputRequest;
import com.app.dto.UserRequest;
import com.app.model.AccountOpen;

public class AccountOpenService {
	public AccountOpen open() {
		return InputRequest.open();
	}
	//public ExistingAccount login() {
		//return CustomerRequest.login();
//}
}
