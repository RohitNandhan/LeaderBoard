package com.crio.starter.exchange;

import com.crio.starter.data.Badges;
import com.crio.starter.data.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserDTO{

  private String UserId;
  private String UserName;
  private Badges badge;
  private int score;
}