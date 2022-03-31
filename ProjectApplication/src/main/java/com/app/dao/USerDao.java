package com.app.dao;

import java.util.List;

import com.app.dto.UserRequest;
import com.app.model.AccountOpen;
import com.app.model.User;

public interface USerDao {
int register();
User login();
AccountOpen open();
Account verifyAccount();
//int fundTransfer();
List<User> listOfUsers();
User findById(int id);
}
