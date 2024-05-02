package com.crio.starter.service;

import java.util.List;

import com.crio.starter.data.User;
import com.crio.starter.exchange.UserDTO;
import com.crio.starter.exchange.UserRequest;

public interface IUserService  {

    User findUserById(String id);
    
    void removeUserById(String id);
    
    void updateUser(String id, int score);

    List<User> findAllUser();

    User createUser(UserRequest userRequest);
  
}
