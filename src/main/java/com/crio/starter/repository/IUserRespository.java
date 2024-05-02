package com.crio.starter.repository;

import com.crio.starter.data.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRespository extends MongoRepository<User, String> {
  
public Optional<User> findById(String extId);

 public List<User> findAll();

 public void deleteById(String extId);

 public User save(User newUser);
}
