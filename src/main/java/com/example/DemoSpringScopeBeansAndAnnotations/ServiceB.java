package com.example.DemoSpringScopeBeansAndAnnotations;

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

    public ServiceB() {
        log.info("Создание ServiceB");
    }

    @Autowired
    public void setAnnoSingleton(AnnoSingleton annoSingleton) {
        log.info("Внедрение annoSingleton в ServiceB ");
        this.annoSingleton = annoSingleton;
    }

    @Autowired
    public void setAnnoPrototype(AnnoPrototype annoPrototype) {
        log.info("Внедрение annoPrototype в ServiceB ");
        this.annoPrototype = annoPrototype;
    }

    @Autowired
    public void setJavaSingleton(JavaSingleton javaSingleton) {
        log.info("Внедрение javaSingleton в ServiceB ");
        this.javaSingleton = javaSingleton;
    }

    @Autowired
    public void setJavaPrototype(JavaPrototype javaPrototype) {
        log.info("Внедрение javaPrototype в ServiceB ");
        this.javaPrototype = javaPrototype;
    }

}
