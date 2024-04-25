package com.example.demospringscopebeansandannotations;

import com.example.demospringscopebeansandannotations.customlistner.CustomSpringEventPublisher;
import com.example.demospringscopebeansandannotations.listener.SpringContextListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceA {

  private AnnoSingleton annoSingleton;
  private AnnoPrototype annoPrototype;
  private JavaSingleton javaSingleton;
  private JavaPrototype javaPrototype;
  private CustomSpringEventPublisher eventPublisher;
  private SpringContextListener springContextListener;

  public void setSpringContextListener(
      SpringContextListener springContextListener) {
    this.springContextListener = springContextListener;
  }

  @Autowired
  public void setEventPublisher(
      CustomSpringEventPublisher eventPublisher) {
    this.eventPublisher = eventPublisher;
  }

  public ServiceA() {
    log.info("Создание ServiceA");
  }


  @Autowired
  public void setAnnoSingleton(AnnoSingleton annoSingleton) {
    eventPublisher.publishCustomEvent("Произошла публикация события annoSingleton в ServiceA");
    log.info("Внедрение annoSingleton в ServiceA ");
    this.annoSingleton = annoSingleton;
    eventPublisher.publishCustomEvent("Завершено событие  setAnnoSingleton  в ServiceA");
  }

  @Autowired
  public void setAnnoPrototype(AnnoPrototype annoPrototype) {
    eventPublisher.publishCustomEvent("Произошла публикация события annoPrototype в ServiceA");
    log.info("Внедрение annoPrototype в ServiceA ");
    this.annoPrototype = annoPrototype;
    eventPublisher.publishCustomEvent("Завершено событие  setAnnoPrototype  в ServiceA");
  }

  @Autowired
  public void setJavaSingleton(JavaSingleton javaSingleton) {
    eventPublisher.publishCustomEvent("Произошла публикация события javaSingleton в ServiceA");
    log.info("Внедрение javaSingleton в ServiceA ");
    this.javaSingleton = javaSingleton;
    eventPublisher.publishCustomEvent("Завершено событие  javaSingleton  в ServiceA");
  }

  @Autowired
  public void setJavaPrototype(JavaPrototype javaPrototype) {
    eventPublisher.publishCustomEvent("Произошла публикация события javaPrototype в ServiceA");
    log.info("Внедрение javaPrototype в ServiceA ");
    this.javaPrototype = javaPrototype;
    eventPublisher.publishCustomEvent("Завершено событие  setJavaPrototype  в ServiceA");
  }
}
