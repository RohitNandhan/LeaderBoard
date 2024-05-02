package com.crio.starter.exchange;

import java.util.List;

import com.crio.starter.data.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ResponseDto{

  private List<User> user; 
}