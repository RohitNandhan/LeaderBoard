/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.crio.starter;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@Log4j2
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Bean
  @Scope("prototype")
  public ModelMapper modelMapper(){
    return new ModelMapper();
  }
}userEntityususerEntity
userEntity