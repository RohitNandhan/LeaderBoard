package com.crio.starter.exchange;

import com.crio.starter.data.Badges;
import com.crio.starter.data.User;
import com.mongodb.lang.NonNull;
import com.mongodb.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserRequest{

  @NonNull
  private String UserId;
  @NonNull
  private String UserName;
  @Nullable
  private Badges badge;
  @Nullable
  private int score;
}