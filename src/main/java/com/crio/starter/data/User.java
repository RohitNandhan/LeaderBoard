package com.crio.starter.data;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "greetings")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
  private String UserId;
  private String UserName;
  @Builder.Default private Badges badge=null;
  @Builder.Default private int score=0;

}
