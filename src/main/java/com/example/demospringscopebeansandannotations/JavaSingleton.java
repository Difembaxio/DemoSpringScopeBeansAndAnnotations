package com.example.demospringscopebeansandannotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaSingleton {

  public JavaSingleton() {
    log.info("Создание JavaSingleton");
  }

  @PostConstruct
  public void init() {
    log.info("Вызов init метода класса JavaSingleton");
  }

  @PreDestroy
  public void destroy() {
    log.info("Вызов destroy метода класса JavaSingleton");
  }
}
