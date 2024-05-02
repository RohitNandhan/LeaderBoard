package com.crio.starter.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crio.starter.data.User;
import com.crio.starter.exchange.UserRequest;
import com.crio.starter.service.IUserService;
import com.crio.starter.service.UserService;

@RestController
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
// @Log4j(GreetingsController.class)
public class UserController {

  private final IUserService UserService;

  @GetMapping("/users")
  public ResponseEntity<List<User>> getAllUsers() {
    log.info("Request received");
    List<User> userList = UserService.findAll();
    
    log.error("No User found");
    log.info("Fetching the user list......");
    return ResponseEntity.ok().body(userList);
  }
    
  @GetMapping("/users/{id}")
  public ResponseEntity<User> getUserById(@PathVariable("id") String id){
    log.info("Received request for messageId: {}",id);

    User userEntity=UserService.getUserById(id);
    if(userEntity == null){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } else{
      return ResponseEntity.ok().body(userEntity);
    }
  }

  @PutMapping("/users/{userId}")
  public ResponseEntity<User> updateUser(@PathVariable("userId") String id, @RequestBody int Score){

    UserService.updateUser(id, Score);
    return null;
  }

  @PostMapping("/users")
  public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest){

    User userEntity=UserService.createUser(userRequest);
    if(userEntity!=null){
      return ResponseEntity.ok().body(userEntity);
    }else{
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
 }
}
