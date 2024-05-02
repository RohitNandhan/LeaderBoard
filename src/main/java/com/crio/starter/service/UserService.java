package com.crio.starter.service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crio.starter.data.User;
import com.crio.starter.exchange.UserRequest;
import com.crio.starter.repository.IUserRespository;
import javax.inject.Provider;

import org.modelmapper.ModelMapper;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

  @Autowired
  private IUserRespository userRepository;

  @Autowired
  private Provider<ModelMapper> modelMapperList;

  @Autowired
  private ModelMapper modelMapper;

  public User findUserById(String id) {

    Optional<User> userOptional = userRepository.findById(id);
    return userOptional.orElse(null);
  }

  public List<User> findAllUser() {
    
    List<User> users=userRepository.findAll();   
    return users;
  }

  public User createUser(UserRequest userRequest) {
  
    User userEntity=modelMapper.map(userRequest,User.class);
    // if(validate(userRequest)){
      User savedUser=userRepository.save(userEntity);
      return savedUser;
    // }
  }

  @Override
  public void removeUserById(String id) {
    userRepository.deleteById(id);
  }

  @Override
  public void updateUser(String id, int score) {
    
    Optional<User> userOptional = userRepository.findById(id);
    if (userOptional.isPresent()) {
        User user = userOptional.get();
        user.setScore(score);
        userRepository.save(user);
  
  }
}


  
}
