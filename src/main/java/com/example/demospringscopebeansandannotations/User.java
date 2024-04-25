package com.example.demospringscopebeansandannotations;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Setter
public class User {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void userDetails() {
    System.out.println("User name = " + name);
  }
}
