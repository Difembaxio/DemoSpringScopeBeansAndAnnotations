package com.example.demospringscopebeansandannotations.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringContextListener {


  @EventListener
  public void handleContextRefreshedEvent(ContextRefreshedEvent event) {
    log.info("Context refreshed " +  event);
  }

  @EventListener
  public void handleContextStartedEvent(ContextStartedEvent event) {
    log.info("Context started " + event);
  }

  @EventListener
  public void handleContextStoppedEvent(ContextStoppedEvent event) {
    log.info("Context stopped " +  event);
  }

  @EventListener
  public void handleContextClosedEvent(ContextClosedEvent event) {
    log.info("Context closed" +  event);
  }
}

