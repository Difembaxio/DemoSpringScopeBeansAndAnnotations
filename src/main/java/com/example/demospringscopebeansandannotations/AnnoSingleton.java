package com.example.demospringscopebeansandannotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AnnoSingleton {

  public AnnoSingleton() {
    log.info("Создание AnnoSingleton");
  }

  @PostConstruct
  public void init() {
    log.info("Вызов init метода класса AnnoSingleton");
  }

  @PreDestroy
  public void destroy() {
    log.info("Вызов destroy метода класса AnnoSingleton");
  }

}

