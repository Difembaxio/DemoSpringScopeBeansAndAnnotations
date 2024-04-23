package com.example.DemoSpringScopeBeansAndAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Slf4j
public class AnnoPrototype {

    public AnnoPrototype() {
        log.info("Создание AnnoPrototype");
    }

    @PostConstruct
    public void init() {
        log.info("Вызов init метода класса AnnoPrototype");
    }

    @PreDestroy
    public void destroy() {
        log.info("Вызов destroy метода класса AnnoPrototype");
    }
}
