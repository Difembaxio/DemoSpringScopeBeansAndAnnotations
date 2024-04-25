package com.example.demospringscopebeansandannotations;

import com.example.demospringscopebeansandannotations.customlistner.CustomSpringEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceB {

  private AnnoSingleton annoSingleton;
  private AnnoPrototype annoPrototype;
  private JavaSingleton javaSingleton;
  private JavaPrototype javaPrototype;

  private CustomSpringEventPublisher eventPublisher;

  @Autowired
  public void setEventPublisher(
      CustomSpringEventPublisher eventPublisher) {
    this.eventPublisher = eventPublisher;
  }

  public ServiceB() {
    log.info("Создание ServiceB");
  }

  @Autowired
  public void setAnnoSingleton(AnnoSingleton annoSingleton) {
    eventPublisher.publishCustomEvent("Произошла публикация события setAnnoSingleton в ServiceB");
    log.info("Внедрение annoSingleton в ServiceB ");
    this.annoSingleton = annoSingleton;
    eventPublisher.publishCustomEvent("Завершено событие  setAnnoSingleton  в ServiceB");
  }

  @Autowired
  public void setAnnoPrototype(AnnoPrototype annoPrototype) {
    eventPublisher.publishCustomEvent("Произошла публикация события setAnnoPrototype в ServiceB");
    log.info("Внедрение annoPrototype в ServiceB ");
    this.annoPrototype = annoPrototype;
    eventPublisher.publishCustomEvent("Завершено событие  setAnnoPrototype  в ServiceB");
  }

  @Autowired
  public void setJavaSingleton(JavaSingleton javaSingleton) {
    eventPublisher.publishCustomEvent("Произошла публикация события setJavaSingleton в ServiceB");
    log.info("Внедрение javaSingleton в ServiceB ");
    this.javaSingleton = javaSingleton;
    eventPublisher.publishCustomEvent("Завершено событие  setJavaSingleton  в ServiceB");
  }

  @Autowired
  public void setJavaPrototype(JavaPrototype javaPrototype) {
    eventPublisher.publishCustomEvent("Произошла публикация события setJavaPrototype в ServiceB");
    log.info("Внедрение javaPrototype в ServiceB ");
    this.javaPrototype = javaPrototype;
    eventPublisher.publishCustomEvent("Завершено событие  setJavaPrototype  в ServiceB");
  }
}
