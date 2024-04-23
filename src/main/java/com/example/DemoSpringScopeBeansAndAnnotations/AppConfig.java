package com.example.DemoSpringScopeBeansAndAnnotations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class AppConfig {

    @Bean
    public JavaSingleton javaSingleton() {
        return new JavaSingleton();
    }

    @Bean
    @Scope("prototype")
    public JavaPrototype javaPrototype() {
        log.info("Вызов javaPrototype");
        return new JavaPrototype();
    }
}